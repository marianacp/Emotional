package br.com.emotional.API;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Classe para a geracao da classificacao do humor da imagem
 */
public class APIFace {
	
	private static final String subscriptionKey = "8e860f62a1cc40ed8bc41dcc4c63db39";

    // NOTE: You must use the same region in your REST call as you used to
    // obtain your subscription keys. For example, if you obtained your
    // subscription keys from westus, replace "westcentralus" in the URL
    // below with "westus".
    //
    // Free trial subscription keys are generated in the westcentralus region. If you
    // use a free trial subscription key, you shouldn't need to change this region.
    private static final String uriBase =
        "https://brazilsouth.api.cognitive.microsoft.com/face/v1.0/detect";

    private static String imageWithFaces =
        "{\"url\":\"http://i0.statig.com.br/esporte/futebol/4116_1338519249655.jpg\"}";

    private static final String faceAttributes =
        "emotion";

    /**
     * Função void que recebe a imagem para fazer a classificacao
     * @param imagem - diretorio da imagem 
     */
    public void insereImagem(String imagem) {
    	
    	APIFace.imageWithFaces = imagem; 
    }
    
    /**
     * Funcao para detectar o "humor" na imagem recebida. Atraves da API ela reconhece e classifica os
     * humores da imagem 
     * @return a classificacao da imagem ou mensagem de erro. 
     */
    public String detectar()
    {
        HttpClient httpclient = new DefaultHttpClient();

        try
        {
            URIBuilder builder = new URIBuilder(uriBase);

            // Request parameters. All of them are optional.
            builder.setParameter("returnFaceId", "true");
            builder.setParameter("returnFaceLandmarks", "false");
            builder.setParameter("returnFaceAttributes", faceAttributes);

            // Prepare the URI for the REST API call.
            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);

            // Request headers.
            request.setHeader("Content-Type", "application/octet-stream");
            request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);
            
            
            File fi = new File(imageWithFaces);
            byte[] fileContent = Files.readAllBytes(fi.toPath());
            
            // Request body.
            ByteArrayEntity reqEntity = new ByteArrayEntity(fileContent); 
            //StringEntity reqEntity = new StringEntity(fileContent);
            request.setEntity(reqEntity);

            // Execute the REST API call and get the response entity.
            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null)
            {
                // Format and display the JSON response.
                System.out.println("REST Response:\n");
                
                double[] lista = new double[5]; 
                double happiness = 0; 
                double surprise = 0; 
                double anger = 0; 
                double neutral = 0; 
                double sadness = 0; 
                

                String jsonString = EntityUtils.toString(entity).trim();
                if (jsonString.charAt(0) == '[') {
                	JSONArray jsonArray = new JSONArray(jsonString);
                	for(int i = 0; i < jsonArray.length(); i++) {
                		JSONObject jsonObject1 = jsonArray.getJSONObject(i); 
                		JSONObject conteudo = jsonObject1.getJSONObject("faceAttributes").getJSONObject("emotion"); 
                		happiness = conteudo.getDouble("happiness"); 
                		surprise = conteudo.getDouble("surprise"); 
                		neutral = conteudo.getDouble("neutral");
                		sadness = conteudo.getDouble("sadness");
                		anger = conteudo.getDouble("anger");
                		
                		lista[0] = happiness;                 		 
                		lista[1] = surprise; 
                		lista[2] = neutral; 
                		lista[3] = sadness; 
                		lista[4] = anger; 


                		
                	}
                	double max = 0; 
                    for (int i = 0; i < lista.length; i++) {
						if (lista[i] > max) {
							max = lista[i];
						}
					}
                	
                	if (max == happiness) {
						return "FELICIDADE"; 
					} else if(max == surprise){
						return "SURPRESA"; 
					}
					 else if(max == neutral){
							return "NEUTRALIDADE"; 
						}
					 else if(max == sadness){
							return "TRISTEZA"; 
						}
					 else if(max == anger){
							return "RAIVA"; 
						}
                }
                else if (jsonString.charAt(0) == '{') {
                    return "";
                } else {
                    return ""; 
                }
            }
            return ""; 
        }
        catch (Exception e)
        {
            // Display error message.
            return ""; 
        }
    }
}

package br.com.emotional.persistencia;

public class DAOException extends Exception{
	 public DAOException(Throwable cause) {
	        super(cause);
	    }
	  
	    public DAOException(String message, Throwable cause) {
	        super(message, cause);
	    }
	  
	    public DAOException(String message) {
	        super(message);
	    }
	  
	    public DAOException() {
	        super();
	    }
}

package br.com.emotional.persistencia;
import java.util.List;

public interface iDAO<T> {

	public T getSingle(Object... chave);
    public List<T> getList();
    public List<T> getList(int top);
}

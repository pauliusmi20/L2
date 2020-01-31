import java.util.ArrayList;

public abstract class Liste{
	protected ArrayList<Object> liste;

	protected boolean isEmpty(){
		return liste.size()== 0;
	}
	protected int size(){
		return liste.size();
	}
	protected void push(Object o){
		liste.add(o);
	} 
	public abstract Object  pop();
}
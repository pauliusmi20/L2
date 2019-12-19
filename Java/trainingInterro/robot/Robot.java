public abstract Robot {
	protected int i,j, nr;
	protected static int series = 0;

	public Robot(int i, int j){
		this.i = i;
		this.j = j;
		nr = ++series;
	}
	protected move(int di, int dj){
		i += di;
		j += dj;
	}
	public int getSeries(){
		return nr;
	}
	public abstract void move(Monde m);
	public abstract void action(Monde m);

}
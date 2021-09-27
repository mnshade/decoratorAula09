public class Cesto extends BuqueFlorDecorator{
    BuqueFlor buqueFlor;
    public Cesto(BuqueFlor buqueFlor){
        this.buqueFlor = buqueFlor;
    }
    public  String getDescricao(){
        return buqueFlor.getDescricao()+"+ cesto";
    }
    public int custo()
    {
        return 25 + buqueFlor.custo();
    }
}
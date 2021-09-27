public class Perfume extends BuqueFlorDecorator{
    BuqueFlor buqueFlor;
    public Perfume(BuqueFlor buqueFlor){
        this.buqueFlor = buqueFlor;
    }
    public  String getDescricao(){
        return buqueFlor.getDescricao()+"+ perfume";
    }
    public int custo()
    {
        return 10 + buqueFlor.custo();
    }
}
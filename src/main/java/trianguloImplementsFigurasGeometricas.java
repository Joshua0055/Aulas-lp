public class trianguloImplementsFigurasGeometricas {
    private double base;
    private double altura;

    public trianguloImplementsFigurasGeometricas(double base, double altura){
       this.base = base;
       this.altura = altura;
    }
    public double getbase(){
        return base;
    }
    public void setbase(double base){
        this.base = base;
    }
    public double getaltura(){
        return altura;
    }
    public void setaltura(double altura){
        this.altura = altura;
    }
    public double calculaArea(){
        return (this.base * this.altura)/2;
    }
}

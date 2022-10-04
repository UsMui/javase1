package assgiment1;

public class PhanSo {
    public int tuso;
    public int mauso;

    public PhanSo() {
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public void inPhanSo(){
        System.out.println(getTuso()+"/"+getMauso());

    }

    public void rutGon(){
        int ucln =1;
        for(int i=Math.min(Math.abs(tuso),Math.abs(mauso)); i>1;i--){
            if(tuso%i==0&mauso%i==0){
                ucln=i;
                break;
            }
        }
        setTuso(tuso/ucln);
        setMauso(mauso/ucln);

    }

    public void nghichDao(){
        int tmp =tuso;
        tuso=mauso;
        mauso=tmp;
    }

    public PhanSo add(PhanSo f){
        PhanSo tong = new PhanSo();
        tong.tuso=this.tuso*f.mauso+this.mauso*f.tuso;
        tong.mauso=this.mauso*f.mauso;
        //tong.rutGon();
        return tong;
    }

    public PhanSo sub(PhanSo f){
        PhanSo hieu = new PhanSo();
        hieu.setTuso(this.tuso*f.mauso-this.mauso*f.tuso);
        hieu.setMauso(this.mauso*f.mauso);
        return hieu;
    }

    public void mul(){

    }

    public void div(){

    }
}

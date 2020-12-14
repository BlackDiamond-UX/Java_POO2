package src.com.Youcode.Heretage.exe1.modele;


import src.com.Youcode.Heretage.exe1.modele.Article;

public class ArticleEnSolde extends Article {

    private int réduction;

    public ArticleEnSolde(String nom, int prix, int réduction) {
        super(nom, prix);
        this.réduction = réduction;
    }

    public int getRéduction() {
        return réduction;
    }

    public void setRéduction(int réduction) {
        this.réduction = réduction;
    }

    @Override
    public int afficher() {
        int percent = super.afficher()*réduction/100;
        return super.afficher() - percent;
    }
}

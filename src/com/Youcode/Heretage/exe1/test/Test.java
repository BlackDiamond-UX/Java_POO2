package src.com.Youcode.Heretage.exe1.test;

import src.com.Youcode.Heretage.exe1.modele.Article;
import src.com.Youcode.Heretage.exe1.modele.ArticleEnSolde;

public class Test {

    public static void main(String[] args) {
        Article Shoes = new Article("Boats", 250);
        System.out.println(Shoes.afficher());

        System.out.println("###############################");
        ArticleEnSolde Sneakers = new ArticleEnSolde("Sandales", 1600, 20);
        System.out.println("The price with réduction is " + Sneakers.afficher());
    }

}

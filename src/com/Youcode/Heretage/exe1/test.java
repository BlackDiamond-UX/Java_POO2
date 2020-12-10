package com.Youcode.Heretage.exe1;

import com.Youcode.Heretage.exe1.Article;
import com.Youcode.Heretage.exe1.ArticleEnSolde;

public class test {

    public static void main(String[] args) {
        Article Shoes = new Article("Boats", 250);
        System.out.println(Shoes.afficher());

        System.out.println("###############################");
        ArticleEnSolde Sneakers = new ArticleEnSolde("Sandales", 1600, 20);
        System.out.println("The price with réduction is " + Sneakers.afficher());
    }

}

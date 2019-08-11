/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.data;

import com.example.cats.models.Cat;

import java.util.ArrayList;

public class CatsData {

    private static ArrayList<Cat> arrayList = new ArrayList<Cat>();

    public static ArrayList<Cat> getArrayList() {
        arrayList.add(new Cat(
                "Abyssinian",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Gustav_chocolate.jpg/220px-Gustav_chocolate.jpg",
                "Egypt",
                "14 - 15",
                "The Abyssinian is easy to care for, and a joy to have in your home. They’re affectionate cats and love both people and other animals.",
                3,
                4,
                5,
                "Active, Energetic, Independent, Intelligent, Gentle"
        ));
        return arrayList;
    }
}

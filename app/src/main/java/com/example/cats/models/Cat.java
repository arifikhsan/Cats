/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Parcelable {
    private String name;
    private String image;
    private String origin;
    private String lifeSpan;
    private String description;
    private Integer childFriendly;
    private Integer dogFriendly;
    private Integer strangerFriendly;
    private List<String> temperament;

    public Cat(String name, String image, String origin, String lifeSpan, String description, Integer childFriendly, Integer dogFriendly, Integer strangerFriendly, List<String> temperament) {
        this.name = name;
        this.image = image;
        this.origin = origin;
        this.lifeSpan = lifeSpan;
        this.description = description;
        this.childFriendly = childFriendly;
        this.dogFriendly = dogFriendly;
        this.strangerFriendly = strangerFriendly;
        this.temperament = temperament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getChildFriendly() {
        return childFriendly;
    }

    public void setChildFriendly(Integer childFriendly) {
        this.childFriendly = childFriendly;
    }

    public Integer getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(Integer dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public Integer getStrangerFriendly() {
        return strangerFriendly;
    }

    public void setStrangerFriendly(Integer strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
    }

    public List<String> getTemperament() {
        return temperament;
    }

    public void setTemperament(List<String> temperament) {
        this.temperament = temperament;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", origin='" + origin + '\'' +
                ", lifeSpan='" + lifeSpan + '\'' +
                ", description='" + description + '\'' +
                ", childFriendly=" + childFriendly +
                ", dogFriendly=" + dogFriendly +
                ", strangerFriendly=" + strangerFriendly +
                ", temperament=" + temperament +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.image);
        dest.writeString(this.origin);
        dest.writeString(this.lifeSpan);
        dest.writeString(this.description);
        dest.writeValue(this.childFriendly);
        dest.writeValue(this.dogFriendly);
        dest.writeValue(this.strangerFriendly);
        dest.writeStringList(this.temperament);
    }

    protected Cat(Parcel in) {
        this.name = in.readString();
        this.image = in.readString();
        this.origin = in.readString();
        this.lifeSpan = in.readString();
        this.description = in.readString();
        this.childFriendly = (Integer) in.readValue(Integer.class.getClassLoader());
        this.dogFriendly = (Integer) in.readValue(Integer.class.getClassLoader());
        this.strangerFriendly = (Integer) in.readValue(Integer.class.getClassLoader());
        this.temperament = in.createStringArrayList();
    }

    public static final Creator<Cat> CREATOR = new Creator<Cat>() {
        @Override
        public Cat createFromParcel(Parcel source) {
            return new Cat(source);
        }

        @Override
        public Cat[] newArray(int size) {
            return new Cat[size];
        }
    };
}

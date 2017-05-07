package com.example.ashut.getitnow;

/**
 * Created by ashut on 07-05-2017.
 */

public class myAds {


    private String mMiwokTranslation,mDefaultTranslation;

    public myAds(String MiwokTranslation,String DefaultTranslation)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
    }
    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}

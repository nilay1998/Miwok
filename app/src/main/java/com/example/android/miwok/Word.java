package com.example.android.miwok;

public class Word
{
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImage=NO_IMAGE_PROVIDED;
    private String mMiwokYTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceId;

    public Word(int Image, String DefaultTranlation,String MiwokTranslation, int AudioResourceId)
    {
        mImage=Image;
        mDefaultTranslation=DefaultTranlation;
        mMiwokYTranslation=MiwokTranslation;
        mAudioResourceId=AudioResourceId;
    }

    public Word( String DefaultTranlation,String MiwokTranslation,int AudioResourceId)
    {
        mDefaultTranslation=DefaultTranlation;
        mMiwokYTranslation=MiwokTranslation;
        mAudioResourceId=AudioResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiwokYTranslation()
    {
        return mMiwokYTranslation;
    }

    public boolean hasImage() {
        return mImage!= NO_IMAGE_PROVIDED;
    }
}

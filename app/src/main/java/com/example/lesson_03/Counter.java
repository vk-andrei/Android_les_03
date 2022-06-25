package com.example.lesson_03;

import android.os.Parcel;
import android.os.Parcelable;

public class Counter implements Parcelable {

    private int value;
    private double doubleValue;

    public Counter() {
    }

    // Метод чтения (сборки) объекта:
    protected Counter(Parcel in) {
        value = in.readInt();
        doubleValue = in.readDouble();
    }

    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

    public void increase() {
        value++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // Метод расковырки объекта:
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(value);
        parcel.writeDouble(doubleValue);
    }
}
package com.example.testklotin

interface ArrayListCardDAO {

    fun add(Card : CardInfo);

    fun list():ArrayList<CardInfo>;

    fun size():Int;

    fun getCard(i : Int):CardInfo;

    fun remove(i: Int);



}
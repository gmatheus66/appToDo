package com.example.testklotin

open class ArrayListCard<T>constructor(var c : CardInfo): ArrayListCardDAO {

    var ListCard = ArrayList<CardInfo>();


    init {
        add(c);
    }

    override fun add(card: com.example.testklotin.CardInfo) {
        ListCard.add(card);
    }

    override fun list(): ArrayList<CardInfo> {
        return ListCard;
    }

    override fun size(): Int {
        return ListCard.size;
    }

    override fun getCard(i : Int): CardInfo {
        return ListCard.get(i);
    }

    override fun remove(i: Int){
        ListCard.removeAt(i);
    }

}

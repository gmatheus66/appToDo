package com.example.testklotin

class CardInfo constructor(val title:String, val description:String, val data_add:String, val data_deadline:String) : CardInfoDAO {

    private var titul: String = title;
    override fun setTitle(t:String){
        this.titul = t
    }

    private var descr: String =  description;
    override fun setDescr(d:String){
        this.descr = d;
    }

    private var data_a: String =  data_add;
    override fun setData_Add(data:String){
        this.data_a = data;
    }

    private var data_l: String = data_deadline;
    override fun setData_DeadLine(d_l:String){
        this.data_l = d_l;

    }


}
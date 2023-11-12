package com.example.contactpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = mutableListOf<ContactItem>()
        list.add(ContactItem(1, "PT Hung", "0978471074", "pthung@gmail.com"))
        list.add(ContactItem(1, "Hieu Phuong", "012321321", "hieuphuong@gmail.com"))
        list.add(ContactItem(1, "Nguyen Van A", "091237621321", "nguyenvana@gmail.com"))
        list.add(ContactItem(1, "Nguyen Van A", "091237621321", "nguyenvana@gmail.com"))
        list.add(ContactItem(1, "Nguyen Van A", "091237621321", "nguyenvana@gmail.com"))
        list.add(ContactItem(1, "Nguyen Van A", "091237621321", "nguyenvana@gmail.com"))
        list.add(ContactItem(1, "Nguyen Van A", "091237621321", "nguyenvana@gmail.com"))
        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adt = CustomContactAdapter(list)
        recyclerView.apply {
            setHasFixedSize(true)
            adapter = adt
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.HORIZONTAL))
        }

    }
}
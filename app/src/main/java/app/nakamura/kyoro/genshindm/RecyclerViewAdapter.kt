package app.nakamura.kyoro.genshindm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val conText: Context) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    val items: MutableList<ResultDmgData> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(conText).inflate(R.layout.item_result_data_cell, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.resultDmgNameTextView.text = item.resultName
        holder.resultDmgTextView.text = item.resultValue
    }

    fun addAll(items: List<ResultDmgData>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val resultDmgNameTextView: TextView = view.findViewById(R.id.resultDmgNameTextView)
        val resultDmgTextView: TextView = view.findViewById(R.id.resultDmgTextView)

    }
}
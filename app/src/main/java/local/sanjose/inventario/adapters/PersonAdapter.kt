package local.sanjose.inventario.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.list_view_person.view.*
import local.sanjose.inventario.models.Person


class PersonAdapter(val context: Context,val layout: Int, val list: List<Person>): BaseAdapter(){

    private val mInflator: LayoutInflater = LayoutInflater.from(context)

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int { //Numero de items que existe en esa lista
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view: View
        val vh: PersonViewHolder

        if (convertView == null){
            view = mInflator.inflate(layout, parent, false)
            vh = PersonViewHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as PersonViewHolder
        }

        val fullName = "${list[position].firstName}, ${list[position].lastName}"
        vh.fullName.text = fullName
        vh.age.text = "${list[position].age}"

        return view

    }
}

private class PersonViewHolder(view: View){
    // Patron de diseño View HOlder en android
    val fullName: TextView = view.textViewName
    val age: TextView = view.textViewAge
}
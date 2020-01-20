package local.sanjose.inventario.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import local.sanjose.inventario.R
import local.sanjose.inventario.models.Person
import kotlinx.android.synthetic.main.activity_list_view.*
import local.sanjose.inventario.adapters.PersonAdapter

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter: PersonAdapter
    private lateinit var personList: List<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        personList = getPersons()
        adapter = PersonAdapter(this,R.layout.list_view_person, personList)
        listView.adapter = adapter
    }


    private fun getPersons(): List<Person> {
        return listOf(
            Person("Lou","Del Carmen",22),
            Person("Diego","Campusmana",24),
            Person("Jose","Sanchez",47),
            Person("Pepe","Soria",9),
            Person("Juanito","Perez",23),
            Person("Anacleto","Tan",65),
            Person("Simoneta","Diaz",28),
            Person("Emiliano","Cruz",23)
        )
    }
}

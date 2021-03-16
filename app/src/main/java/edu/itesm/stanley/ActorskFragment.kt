package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_actorsk.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [ActorskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActorskFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        actors_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ActorAdapter(createData())
        }
    }
    fun createData(): ArrayList<Actors> {
        val actors = ArrayList<Actors>()

        actors.add(Actors(R.drawable.malcom,name = "Malcolm McDowell", description = "Malcolm John Taylor was born on June 13, 1943 in Leeds, England, to working-class parents Edna (McDowell), a hotelier, and Charles Taylor, a publican."))
        actors.add(Actors(R.drawable.tom,name ="Tom Cruise", description = "In 1976, if you had told fourteen-year-old Franciscan seminary student Thomas Cruise Mapother IV that one day in the not too distant future he would be Tom Cruise, one of the top 100 movie stars of all time, he would have probably grinned and told you that his ambition was to join the priesthood."))
        actors.add(Actors(R.drawable.nicole,name = "Nicole Kidman", description = "Elegant Nicole Kidman, known as one of Hollywood's top Australian imports, was actually born in Honolulu, Hawaii, while her Australian parents were there on educational visas."))
        actors.add(Actors(R.drawable.ryan,name = "Ryan O'Neal", description = "Ryan O'Neal was born on April 20, 1941 in Los Angeles, California, USA as Charles Samuel Eldridge Patrick Ryan O'Neal III. He is an actor, known for Love Story (1970), Barry Lyndon (1975) and Paper Moon (1973). He was previously married to Leigh Taylor-Young and Joanna Moore."))
        actors.add(Actors(R.drawable.jack,name = "Jack Nicholson", description = " Jack Nicholson, an American actor, producer, director and screenwriter, is a three-time Academy Award winner and twelve-time nominee. Nicholson is also notable for being one of two actors - the other being Michael Caine - who have received an Oscar nomination in every decade from the 1960s through "))
        actors.add(Actors(R.drawable.vincent,name ="Vincent D'Onofrio", description = "Vincent Phillip D'Onofrio was born on June 30, 1959 in Brooklyn, New York, to Phyllis, a restaurant manager and server, and Gene D'Onofrio, a theatre production assistant and interior designer. He is of Italian descent and has two older sisters. He studied at the Actors Studio and the American"))
        actors.add(Actors(R.drawable.matthew,name ="Matthew Modine", description ="The youngest of seven, Matthew was born in Loma Linda, Ca, to Dolores (Warner), a bookkeeper, and Mark Alexander Modine, a drive-in theater manager. After graduating high school in Imperial Beach, Ca. Modine moved to NYC (1979). "))
        actors.add(Actors(R.drawable.keir,"Keir Dullea", "Tall, slim, remote and boyishly handsome, one of Keir Dullea's most arresting features is his pale blue eyes, which featured in a number of watershed films of the 1960s. His major breakthrough (providing him legendary status) was the starring role as astronaut Dave Bowman in Stanley Kubrick's 2001"))
        actors.add(Actors(R.drawable.gary," Gary Lockwood", "Gary Lockwood was born in Van Nuys, California. He attended the University of California at Los Angeles on a football scholarship"))
        actors.add(Actors(R.drawable.leonard,"Leonard Rossiter", "Leonard Rossiter was born on October 21st, 1926 in Liverpool. Unable to afford to go to university, he worked in an insurance office until he was 27, when he joined Preston repertory company and made his professional stage debut in \"The Gay Dog\". After Preston, he starred in productions at "))
        actors.add(Actors(R.drawable.sterling,"Sterling Hayden", "Born to George & Frances Simonson Walter, and named Sterling Relyea Walter. Father died in 1925. Adopted by stepfather 'James Hayden' renamed Sterling Walter Hayden. Grew up in New Hampshire, Massachusetts, Pennsylvania, Washington D.C., and Maine. Though very poor, attended prep school at"))
        actors.add(Actors(R.drawable.peter,"Peter Sellers","Often credited as the greatest comedian of all time, Peter Sellers was born Richard Henry Sellers to a well-off acting family in 1925 in Southsea, a suburb of Portsmouth."))
        actors.add(Actors(R.drawable.james,"James Earl Jones","Widely regarded as the one of greatest stage and screen actors both in his native USA and internationally, James Earl Jones was born on January 17, 1931 in Arkabutla, Mississippi"))
        return actors
    }

}
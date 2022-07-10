package dev.phelisia.twitterreplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.phelisia.twitterreplica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        displaycontact()
    }

    private fun displaycontact() {
        var contact1=TwittterItem("SK","sang@jeruto","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact2=TwittterItem("LJ","judy@wanaina","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact3=TwittterItem("KJ","conslate@koyo","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact4=TwittterItem("HK","maryann@gathanga","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact5=TwittterItem("PJ","mercy@yugi","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact6=TwittterItem("Abby","natete@verite","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact7=TwittterItem("Abby","0718117097","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact8=TwittterItem("Abby","Lucy@karimi","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact9=TwittterItem("Abby","kirigo@mercy","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var contact10=TwittterItem("Abby","s","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var allcontact= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var twitterAdapter=TwitterAdapter(allcontact)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=twitterAdapter
    }
}
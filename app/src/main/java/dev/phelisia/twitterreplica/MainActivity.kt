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
        displaytweet()
    }

    private fun displaytweet() {
        var tweet1=TwittterItem("SK","sang@jeruto","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet2=TwittterItem("LJ","judy@wanaina","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet3=TwittterItem("KJ","conslate@koyo","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet4=TwittterItem("HK","maryann@gathanga","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet5=TwittterItem("PJ","mercy@yugi","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet6=TwittterItem("Abby","natete@verite","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet7=TwittterItem("Abby","0718117097","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet8=TwittterItem("Abby","Lucy@karimi","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet9=TwittterItem("Abby","kirigo@mercy","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var tweet10=TwittterItem("Abby","s","2h","But now, this is what the Lord says—\n" +
                "    he who created you, Jacob,\n" +
                "    he who formed you, Israel:\n" +
                "“Do not fear, for I have redeemed you;\n" +
                "    I have summoned you by name; you are mine.","","","","","","")
        var alltweets= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10)
        var twitterAdapter=TwitterAdapter(alltweets)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=twitterAdapter
    }
}
package com.example.mitushi.runnerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DealermapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dealermap );
        //========= Start Toolbar Back Side ==========
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        //========= End Toolbar Back Side ==========

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapDealer);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Tangail. and move the camera
        LatLng Feni = new LatLng(23.0124139, 91.3813209);
        mMap.addMarker(new MarkerOptions().position(Feni).title("Feni-Bogdadia Motors").snippet("01817252547"));

        LatLng Moulovibazar = new LatLng(24.4831628, 91.7533921);
        mMap.addMarker(new MarkerOptions().position(Moulovibazar).title("Moulovibazar-Khan Motors").snippet("01819932284"));

        LatLng Mymensingh = new LatLng(24.3935349, 89.0148461);
        mMap.addMarker(new MarkerOptions().position(Mymensingh).title("Mymensingh-Arfan Motors").snippet("01757823030"));

        LatLng Sirajganj = new LatLng(24.4555582, 89.6239728);
        mMap.addMarker(new MarkerOptions().position(Sirajganj).title("Sirajganj-SM Motors").snippet("01712247725"));

        LatLng sylhet = new LatLng(24.8821807, 91.8660643);
        mMap.addMarker(new MarkerOptions().position(sylhet).title("sylhet-Bahar Enterprise").snippet("01711289426"));

        LatLng Chittagong = new LatLng(22.3258742, 91.6797801);
        mMap.addMarker(new MarkerOptions().position(Chittagong).title("Chittagong-3 STAR MOTORS").snippet("01840121221"));

        LatLng Satkhira = new LatLng(22.704904, 89.055941);
        mMap.addMarker(new MarkerOptions().position(Satkhira).title("Satkhira-M/S.JHORNA ENTERPRISE").snippet("01711481930"));

        LatLng Dhaka = new LatLng(23.7064255, 90.4091772);
        mMap.addMarker(new MarkerOptions().position(Dhaka).title("Dhaka-Bappy Canter Centre").snippet("01716552129"));

        LatLng Gazipur = new LatLng(23.9989972, 90.4176131);
        mMap.addMarker(new MarkerOptions().position(Gazipur).title("Gazipur-M/S.Anisha & jannat Motors").snippet("01911022338"));

        LatLng kustia = new LatLng(23.8971464, 89.086256);
        mMap.addMarker(new MarkerOptions().position(kustia).title("kustia-Liton Motors").snippet("01718045168"));

        LatLng Gazi = new LatLng(24.2119434, 90.4244923);
        mMap.addMarker(new MarkerOptions().position(Gazi).title("Gazipur-Tanha Motors").snippet("01920-20212"));

        LatLng Faridpur = new LatLng(23.6013295, 89.823687);
        mMap.addMarker(new MarkerOptions().position(Faridpur).title("Faridpur-BILLAL MOTORS").snippet("01727844370"));

        LatLng Mymen = new LatLng(25.1229139, 90.3340422);
        mMap.addMarker(new MarkerOptions().position(Mymen).title("Mymensingh-Tyre Gallary & Parts House").snippet("01190893218"));

        LatLng Chitta = new LatLng(23.8287846, 90.7929682);
        mMap.addMarker(new MarkerOptions().position(Chitta).title("Chittagong-National Auto Supplier").snippet("01711841707"));

        LatLng NARSHINDI = new LatLng(23.9223353, 90.7167613);
        mMap.addMarker(new MarkerOptions().position(NARSHINDI).title("NARSHINDI-M/S ASA MOTORS").snippet("01925508750"));

        LatLng Chittagon = new LatLng(22.3339007, 91.8093568);
        mMap.addMarker(new MarkerOptions().position(Chittagon).title("Chittagong-M/S Saiful Motors").snippet("01857676775"));

        LatLng Dinajpur = new LatLng(25.6237799, 88.6117313);
        mMap.addMarker(new MarkerOptions().position(Dinajpur).title("Dinajpur-New Abbas Engineering Works").snippet("01718170004"));

        LatLng Moulavibazar = new LatLng(24.3135237, 91.7075347);
        mMap.addMarker(new MarkerOptions().position(Moulavibazar).title("Moulavibazar-S.R Motors").snippet("01712496963"));

        LatLng Dhk = new LatLng(23.7065796, 90.4102132);
        mMap.addMarker(new MarkerOptions().position(Dhk).title("Dhaka-RASEL Motors").snippet("01819471009"));

        LatLng Natore = new LatLng(24.4123369, 88.9616862);
        mMap.addMarker(new MarkerOptions().position(Natore).title("Natore-Tuhin Motors").snippet("01711174515"));

        LatLng Naokhali = new LatLng(22.7955866, 91.2025389);
        mMap.addMarker(new MarkerOptions().position(Naokhali).title("Naokhali-Bagdad Motors").snippet("01818812224"));

        LatLng THAKURGAON = new LatLng(26.0270135, 88.44846);
        mMap.addMarker(new MarkerOptions().position(THAKURGAON).title("THAKURGAON-RADHA USHA MOTORS").snippet("01713720623"));

        LatLng Pabna = new LatLng(24.0132976, 89.2363207);
        mMap.addMarker(new MarkerOptions().position(Pabna).title("Pabna-Mokbul Automibiles").snippet("01715361886"));

        LatLng Satkhir = new LatLng(22.7145165, 89.0352028);
        mMap.addMarker(new MarkerOptions().position(Satkhir).title("Satkhira-M/S ALLARDEN MOTORS & MOBILE CENTER").snippet("01198338440"));

        LatLng Naokhal = new LatLng(22.7955866, 91.2025389);
        mMap.addMarker(new MarkerOptions().position(Naokhal).title("Naokhali-Bagdad Motors").snippet("01818812224"));

        LatLng Farid = new LatLng(23.6013295, 89.823687);
        mMap.addMarker(new MarkerOptions().position(Farid).title("Faridpur-M/S Howlader Motors").snippet("01916427903"));

        LatLng Khulna = new LatLng(22.8170441, 89.5480442);
        mMap.addMarker(new MarkerOptions().position(Khulna).title("Khulna-Kalam Motors").snippet("01912920655"));

        LatLng Pab = new LatLng(24.0242949, 89.2455609);
        mMap.addMarker(new MarkerOptions().position(Pab).title("Pabna-Albin Motors").snippet("01774202384"));

        LatLng Dha = new LatLng(23.7064255, 90.4091772);
        mMap.addMarker(new MarkerOptions().position(Dha).title("Dhaka-Welcome Motors").snippet("01771731696"));

        LatLng Faridp = new LatLng(23.542468, 89.6251774);
        mMap.addMarker(new MarkerOptions().position(Faridp).title("Faridpur-JOY MOTORS & STEEL HOUSE").snippet("01713020506"));

        LatLng Gazip = new LatLng(24.2175169, 90.395007);
        mMap.addMarker(new MarkerOptions().position(Gazip).title("Gazipur-Mayer Dowa Eng.Workshop").snippet("01920202122"));

        LatLng Tangail = new LatLng(24.3907227, 89.9869108);
        mMap.addMarker(new MarkerOptions().position(Tangail).title("Tangail-M/S Rupom Motors").snippet("01716797123"));

        LatLng Dk = new LatLng(23.7636971, 90.3706906);
        mMap.addMarker(new MarkerOptions().position(Dk).title("Dhaka-Jamuna Motors").snippet("01611528411"));

        LatLng Ga = new LatLng(24.2175169, 90.395007);
        mMap.addMarker(new MarkerOptions().position(Ga).title("Gazipur-Zaman Enterprise").snippet("01715364553"));

        LatLng Khul = new LatLng(22.8438628, 89.5021147);
        mMap.addMarker(new MarkerOptions().position(Khul).title("Khulna-Shajid Motors").snippet("01717128941"));

        LatLng Chit = new LatLng(22.3970358, 91.8128855);
        mMap.addMarker(new MarkerOptions().position(Chit).title("Chittagong-Boishakhi Motors").snippet("01818204503"));

        LatLng Bogra = new LatLng(24.8413651, 89.3001658);
        mMap.addMarker(new MarkerOptions().position(Bogra).title("Bogra-Nobel Motors").snippet("01716388600"));

        LatLng Bogr = new LatLng(24.8413651, 89.3001658);
        mMap.addMarker(new MarkerOptions().position(Bogr).title("Bogra-Sherpur Motors").snippet("01716542024"));

        LatLng Dhak = new LatLng(23.7852853, 90.3340744);
        mMap.addMarker(new MarkerOptions().position(Dhak).title("Dhaka-City Motors Parts Dealer").snippet("01744995539"));

        LatLng Jessore = new LatLng(23.165118, 89.1585298);
        mMap.addMarker(new MarkerOptions().position(Jessore).title("Jessore-Sultana Motors").snippet("01733111764"));

        LatLng Dhka = new LatLng(23.7852853, 90.3340744);
        mMap.addMarker(new MarkerOptions().position(Dhka).title("Dhaka-City Motors Parts Dealer").snippet("01744995539"));

        LatLng Moulovi = new LatLng(24.6283122, 91.6667998);
        mMap.addMarker(new MarkerOptions().position(Moulovi).title("Moulovibazar-Al-Mahabub Motors").snippet("01711469685"));

        LatLng Fen = new LatLng(23.0124139, 91.3813209);
        mMap.addMarker(new MarkerOptions().position(Fen).title("Feni-Arafat Motors").snippet("01730088121"));

        LatLng Fni = new LatLng(23.0124139, 91.3813209);
        mMap.addMarker(new MarkerOptions().position(Fni).title("Feni-Master Automobile").snippet("01817019044"));

        LatLng Chittago = new LatLng(22.3382669, 91.8112748);
        mMap.addMarker(new MarkerOptions().position(Chittago).title("Chittagong-New Era Autos").snippet("01815645081"));

        LatLng Chittagong2 = new LatLng(22.3258742, 91.6797801);
        mMap.addMarker(new MarkerOptions().position(Chittagong2).title("Chittagong-Silver Motors").snippet("01829284697"));

        LatLng Chittagong3 = new LatLng(22.4950518, 92.2169208);
        mMap.addMarker(new MarkerOptions().position(Chittagong3).title("Chittagong-Hazi Yousuf motors").snippet("01851047163"));

        LatLng Borishal = new LatLng(22.6953793, 90.3187846);
        mMap.addMarker(new MarkerOptions().position(Borishal).title("Borishal-Forekan Motors").snippet("01716964953"));

        LatLng Dinajpur2 = new LatLng(25.6248354, 88.6305401);
        mMap.addMarker(new MarkerOptions().position(Dinajpur2).title("Dinajpur-Aziz Auto").snippet("01796554307"));

        LatLng Dhaka2 = new LatLng(23.8104659, 90.327261);
        mMap.addMarker(new MarkerOptions().position(Dhaka2).title("Dhaka-Kismat Motors").snippet("01717054777"));

        LatLng Chittagong4 = new LatLng(22.3686935,91.775117);
        mMap.addMarker(new MarkerOptions().position(Chittagong4).title("Chittagong-Bagdad Motors").snippet("01914190376"));

        LatLng comilla = new LatLng(23.4686961, 91.1175665);
        mMap.addMarker(new MarkerOptions().position(comilla).title("comilla-4 Wheel Motors").snippet("01821181116"));

        LatLng Manikgonj = new LatLng(23.8493981, 89.9990919);
        mMap.addMarker(new MarkerOptions().position(Manikgonj).title("Manikgonj-Alif Eicher Motors").snippet("01683276041"));

        LatLng Tangail2 = new LatLng(24.1671896, 89.9754135);
        mMap.addMarker(new MarkerOptions().position(Tangail2).title("Tangail-Nava-Nabil Parts House").snippet("01715364553"));

        LatLng Faridpur2 = new LatLng(23.5933859, 89.8124575);
        mMap.addMarker(new MarkerOptions().position(Faridpur2).title("Faridpur-Satata Motors").snippet("01713561025"));

        LatLng Manikgonj2 = new LatLng(23.8493981, 89.9990919);
        mMap.addMarker(new MarkerOptions().position(Manikgonj2).title("Manikgonj-Shihab Eicher Motors").snippet("01716865496"));

        LatLng Jessore2 = new LatLng(23.165118, 89.1585298);
        mMap.addMarker(new MarkerOptions().position(Jessore2).title("Jessore-Sohel Motors").snippet("01796554352"));

        LatLng Noakhali = new LatLng(22.8387883, 91.1498258);
        mMap.addMarker(new MarkerOptions().position(Noakhali).title("Noakhali-Mizan Autos").snippet("01811285711"));

        LatLng Feni2 = new LatLng(23.0124139, 91.3813209);
        mMap.addMarker(new MarkerOptions().position(Feni2).title("Feni-M/s Riaz Motots").snippet("01823111064"));

        LatLng Chittagong5 = new LatLng(22.3970358, 91.8128855);
        mMap.addMarker(new MarkerOptions().position(Chittagong5).title("Chittagong-Rupali Motors").snippet("01715013956"));

        LatLng Feni3 = new LatLng(23.0057614, 91.4010143);
        mMap.addMarker(new MarkerOptions().position(Feni3).title("Feni-M/S Maa Motors(new)").snippet("01819849093"));

        LatLng Laxmipur = new LatLng(22.9423227, 90.8005421);
        mMap.addMarker(new MarkerOptions().position(Laxmipur).title("Laxmipur-Nupur Motors").snippet("01796554315"));

        LatLng Chandpur = new LatLng(23.2259721, 90.6432363);
        mMap.addMarker(new MarkerOptions().position(Chandpur).title("Chandpur-EARUL MOTORS").snippet("01796554314"));

        LatLng Bogra2 = new LatLng(24.8413651, 89.3001658);
        mMap.addMarker(new MarkerOptions().position(Bogra2).title("Bogra-Khokon Motors").snippet("01711236193"));

        LatLng Chittagong6 = new LatLng(22.3258742, 91.6797801);
        mMap.addMarker(new MarkerOptions().position(Chittagong6).title("Chittagong-Habib Motors").snippet("01924163850"));

        LatLng Moulovibazar2 = new LatLng(24.4831628, 91.7533921);
        mMap.addMarker(new MarkerOptions().position(Moulovibazar2).title("Moulovibazar-Mozid Motors").snippet("01710284130"));

        LatLng Naogaon = new LatLng(24.8059711, 88.9021388);
        mMap.addMarker(new MarkerOptions().position(Naogaon).title("Naogaon-M/S ASHIK MOTORS").snippet("01924163850"));

        LatLng Dhaka3 = new LatLng(23.7852853, 90.3340744);
        mMap.addMarker(new MarkerOptions().position(Dhaka3).title("Dhaka-Dhaka Motors").snippet("01744995539"));

        LatLng Chittagong7 = new LatLng(22.3100611, 91.7982602);
        mMap.addMarker(new MarkerOptions().position(Chittagong7).title("Chittagong-Baba Vandare Motors").snippet("017111372299"));

        LatLng Dhaka4 = new LatLng(23.7064255, 90.4091772);
        mMap.addMarker(new MarkerOptions().position(Dhaka4).title("Dhaka-M/S Bikrampur Motors").snippet("01919370781"));

        LatLng Tangail3 = new LatLng(24.2476913, 89.8820493);
        mMap.addMarker(new MarkerOptions().position(Tangail3).title("Tangail-M/S J.R. Enterprise").snippet("01795267282"));

        LatLng Chittagong8 = new LatLng(22.3371869, 91.8117031);
        mMap.addMarker(new MarkerOptions().position(Chittagong8).title("Chittagong-Mohammadia Tata Eicher Motors").snippet("01839877774"));

        LatLng Gazipur3 = new LatLng(23.7386142, 90.3908095);
        mMap.addMarker(new MarkerOptions().position(Gazipur3).title("Gazipur-M/S Swad Motors Parts Dealer").snippet("01711443415"));

        LatLng Gazipur4 = new LatLng(23.7386142, 90.3908095);
        mMap.addMarker(new MarkerOptions().position(Gazipur4).title("Gazipur-M/S Sumaiya Enterprise").snippet("01752591385"));

        LatLng Sathkhira = new LatLng(22.8682732, 89.0408206);
        mMap.addMarker(new MarkerOptions().position(Sathkhira).title("Sathkhira-M/S Sumon Motors").snippet("01779023851"));

        LatLng Kustia = new LatLng(23.6510866, 89.0129653);
        mMap.addMarker(new MarkerOptions().position(Kustia).title("Kustia-M/S Metro Motors").snippet("01711373007"));

        LatLng Rajbari = new LatLng(23.652157, 89.4333749);
        mMap.addMarker(new MarkerOptions().position(Rajbari).title("Rajbari-Mohammad Ali Engineering Workshop Parts Dealer").snippet("01716048356"));

        LatLng Tangail4 = new LatLng(24.3396675, 89.918375);
        mMap.addMarker(new MarkerOptions().position(Tangail4).title("Tangail-Sun Motors").snippet("01795752098"));

        LatLng Narayangonj = new LatLng(23.6416718, 90.4432933);
        mMap.addMarker(new MarkerOptions().position(Narayangonj).title("Narayangonj-GFS Eicher Motors").snippet("01915798359"));

        LatLng Kustia2 = new LatLng(23.8971464, 89.086256);
        mMap.addMarker(new MarkerOptions().position(Kustia2).title("Kustia-M.R.Motors Parts Dealer").snippet("01710241996"));

        LatLng Moulovibazar00 = new LatLng(24.4831628, 91.7533921);
        mMap.addMarker(new MarkerOptions().position(Moulovibazar00).title("Moulovibazar-Mojumdar Motors").snippet("01711137299"));

        LatLng Jamalpur = new LatLng(24.9268766, 89.9310349);
        mMap.addMarker(new MarkerOptions().position(Jamalpur).title("Jamalpur-Islam Motors Mechanic").snippet("01796554347"));

        LatLng Tangail5 = new LatLng(24.2678216, 89.9226966);
        mMap.addMarker(new MarkerOptions().position(Tangail5).title("Tangail-Bhutto Automobile").snippet("01712899384"));

        LatLng Narshindi = new LatLng(24.0395658, 90.7267283);
        mMap.addMarker(new MarkerOptions().position(Narshindi).title("Narshindi-Bhai Bhai Motors").snippet("01920469172"));

        LatLng JESSORE = new LatLng(22.8613229, 89.2147328);
        mMap.addMarker(new MarkerOptions().position(JESSORE).title("JESSORE-HASSAN MOTORS PARTS DEALER").snippet("07196554302"));

        LatLng Comilla = new LatLng(23.4212718,91.1704593);
        mMap.addMarker(new MarkerOptions().position(Comilla).title("Comilla-M/s Islampur Motors").snippet("01818812224"));

        LatLng Chittagong9 = new LatLng(22.3100611, 91.7982602);
        mMap.addMarker(new MarkerOptions().position(Chittagong9).title("Chittagong-Jamal Auto Mobile").snippet("01712215795"));

        LatLng Dhaka5 = new LatLng(23.8104659, 90.327261);
        mMap.addMarker(new MarkerOptions().position(Dhaka5).title("Dhaka-Sorna Motors").snippet("01915692076"));

        LatLng Dhaka6 = new LatLng(23.8104659, 90.327261);
        mMap.addMarker(new MarkerOptions().position(Dhaka6).title("Dhaka-Amina Motors").snippet("01680346354"));

        LatLng Khulna2 = new LatLng(22.8255638, 89.5259999);
        mMap.addMarker(new MarkerOptions().position(Khulna2).title("Khulna-Nabid Motors").snippet("01923871484"));

        LatLng Rangpur = new LatLng(25.715869, 89.2445965);
        mMap.addMarker(new MarkerOptions().position(Rangpur).title("Rangpur-Alauddin Motors Parts Dealer").snippet("01171087796"));

        LatLng Khulna3 = new LatLng(22.8998319, 89.5093051);
        mMap.addMarker(new MarkerOptions().position(Khulna3).title("Khulna-Parts House Parts Dealer").snippet("01912609087"));

        LatLng Hobigonj = new LatLng(24.3783847, 91.3809721);
        mMap.addMarker(new MarkerOptions().position(Hobigonj).title("Hobigonj-Al Barakah Motors Parts Dealer").snippet("01713816533"));

        LatLng Chittagong00 = new LatLng(22.3478745, 91.7951888);
        mMap.addMarker(new MarkerOptions().position(Chittagong00).title("Chittagong-Ureka Motors Parts Dealer").snippet("01711832478"));

        LatLng Sirajgonj = new LatLng(24.3172589, 89.5466851);
        mMap.addMarker(new MarkerOptions().position(Sirajgonj).title("Sirajgonj-Uk Motors Ltd Parts Dealer").snippet("01737108182"));

        LatLng Bogra3 = new LatLng(24.8493146, 89.3695479);
        mMap.addMarker(new MarkerOptions().position(Bogra3).title("Bogra-Biddud Motors").snippet("01718198495"));

        LatLng Shylet = new LatLng(24.8968789, 91.8474199);
        mMap.addMarker(new MarkerOptions().position(Shylet).title("Shylet-Allahr Dan Mayer Doa Motots Parts Dealer").snippet("01713802550"));

        LatLng xDhaka = new LatLng(23.7189311, 90.4095242);
        mMap.addMarker(new MarkerOptions().position(xDhaka).title("Dhaka-AR (BD) INTERNATIONALParts Dealer").snippet("01977569841"));

        LatLng Gazipur5 = new LatLng(23.9059036, 90.3975534);
        mMap.addMarker(new MarkerOptions().position(Gazipur5).title("Gazipur-M/S Bismillah Motors").snippet("01878102575"));

        LatLng Gazipur6 = new LatLng(23.9059036, 90.3975534);
        mMap.addMarker(new MarkerOptions().position(Gazipur6).title("Gazipur-M/S Swadhin Enterprise Parts Dealer").snippet("01754369438"));

        LatLng Dhaka7 = new LatLng(23.747902, 90.3984953);
        mMap.addMarker(new MarkerOptions().position(Dhaka7).title("Dhaka-M/S Kamal Enterprise").snippet("01748641954"));

        LatLng Jessore3 = new LatLng(23.165118, 89.1585298);
        mMap.addMarker(new MarkerOptions().position(Jessore3).title("Jessore-Raihan Motors Parts Dealer").snippet("01956443768"));

        LatLng Dhaka8 = new LatLng(23.9760483, 90.2614617);
        mMap.addMarker(new MarkerOptions().position(Dhaka8).title("Dhaka-M/S Alif Motors Parts Dealer").snippet("01789062976"));

        LatLng Lalmonithat = new LatLng(25.8697286, 89.4435456);
        mMap.addMarker(new MarkerOptions().position(Lalmonithat).title("Lalmonithat-Madina Motors & Auto Centre").snippet("01723316060"));

        LatLng Lalmonithat1 = new LatLng(25.8697286, 89.4435456);
        mMap.addMarker(new MarkerOptions().position(Lalmonithat1).title("Lalmonithat-M/S As As Trucktor Spare House").snippet("01725857384"));

        LatLng Satkhira1 = new LatLng(23.7493237, 90.3500493);
        mMap.addMarker(new MarkerOptions().position(Satkhira1).title("Satkhira-New Bangla Motors").snippet("01711450272"));

        LatLng Chittagong1 = new LatLng(22.3120998, 91.8013788);
        mMap.addMarker(new MarkerOptions().position(Chittagong1).title("Chittagong-S S Automobile").snippet("01815384167"));

        LatLng Jessore4 = new LatLng(23.0342758, 88.8638584);
        mMap.addMarker(new MarkerOptions().position(Jessore4).title("Jessore-M/S Reza Motors").snippet("01712679094"));

        LatLng Madaripur = new LatLng(23.3888289, 90.1401067);
        mMap.addMarker(new MarkerOptions().position(Madaripur).title("Madaripur-M/S Emran Eva Enterprise").snippet("01720467770"));

        LatLng Dhaka01 = new LatLng(23.8926228, 90.3870105);
        mMap.addMarker(new MarkerOptions().position(Dhaka01).title("Dhaka-M/S Mostafa Machinery").snippet("01938831418"));

        LatLng Mymensingh01 = new LatLng(24.4054958, 90.3802729);
        mMap.addMarker(new MarkerOptions().position(Mymensingh01).title("Mymensingh-Ma Motors").snippet("01716706661"));

        LatLng Munsigonj01 = new LatLng(23.5679023, 90.509149);
        mMap.addMarker(new MarkerOptions().position(Munsigonj01).title("Munsigonj-Dewan Motors").snippet("01820296822"));

        LatLng Hobigonj01 = new LatLng(24.3783847, 91.3809721);
        mMap.addMarker(new MarkerOptions().position(Hobigonj01).title("Hobigonj-Islam Motors").snippet("01711445297"));

        LatLng Dhaka02 = new LatLng(24.3783847, 91.3809721);
        mMap.addMarker(new MarkerOptions().position(Dhaka02).title("Dhaka-Oli Motors").snippet("01819134826"));

        LatLng Netrokona = new LatLng(22.6286741, 88.2958704);
        mMap.addMarker(new MarkerOptions().position(Netrokona).title("Netrokona-Jahanara Motors").snippet("01711045818"));

        LatLng Mymensingh02 = new LatLng(24.7489219, 90.3614763);
        mMap.addMarker(new MarkerOptions().position(Mymensingh02).title("Mymensingh-Arifa Motors").snippet("01712676638"));

        LatLng Noakhali01 = new LatLng(22.9453438, 91.1141199);
        mMap.addMarker(new MarkerOptions().position(Noakhali01).title("Noakhali-M/S Mojaffor Treding").snippet("01819915059"));

        LatLng Chittagong02 = new LatLng(22.36882, 91.7753235);
        mMap.addMarker(new MarkerOptions().position(Chittagong02).title("Chittagong-M/S Rabbi Automobile").snippet("01712735018"));

        LatLng Jessore03 = new LatLng(23.165118, 89.1585298);
        mMap.addMarker(new MarkerOptions().position(Jessore03).title("Jessore-Labbi Motors").snippet("01741866699"));

        LatLng Rangpur01 = new LatLng(25.7336746, 89.2845771);
        mMap.addMarker(new MarkerOptions().position(Rangpur01).title("Rangpur-Tania Motors").snippet("01711367942"));

        LatLng Rangpur02 = new LatLng(25.7336746, 89.2845771);
        mMap.addMarker(new MarkerOptions().position(Rangpur02).title("Rangpur-Purnota Motors").snippet("01784212196"));

        LatLng Laxmipur01 = new LatLng(22.9295469, 90.7222319);
        mMap.addMarker(new MarkerOptions().position(Laxmipur01).title("Laxmipur-Genuine Motors").snippet("01868792314"));

        LatLng Bogra01 = new LatLng(23.7908376, 90.3972298);
        mMap.addMarker(new MarkerOptions().position(Bogra01).title("Bogra-M/S Pabna Motors").snippet("01713632723"));

        LatLng Dhaka03 = new LatLng(23.7064255, 90.4091772);
        mMap.addMarker(new MarkerOptions().position(Dhaka03).title("Dhaka-Sojib Automobiles").snippet("01906828395"));

        LatLng Shunamgong = new LatLng(24.9885573, 91.3787115);
        mMap.addMarker(new MarkerOptions().position(Shunamgong).title("Shunamgong-Janani Motors").snippet("01710843604"));

        LatLng Sylhet = new LatLng(24.8997595, 91.8259622);
        mMap.addMarker(new MarkerOptions().position(Sylhet).title("Sylhet-M/S Rony Motors").snippet("01711156475"));

        LatLng Chittagong04 = new LatLng(22.3385499, 91.8113923);
        mMap.addMarker(new MarkerOptions().position(Chittagong04).title("Chittagong-UDAYON JUMBO MOTORS").snippet("01758005217"));

        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(Dhaka02,6));

    }

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.service_center) {
            Intent y = new Intent(this,MapsActivity.class);
            startActivity(y);

        } else if (id == R.id.star_mechanic) {

            Intent y = new Intent(this,MechanicmapActivity.class);
            startActivity(y);

        } else if (id == R.id.up_service_center) {

            Intent y = new Intent(this,ServicemapActivity.class);
            startActivity(y);
        }

        else if (id == R.id.dealer_service) {

            Intent y = new Intent(this,DealermapActivity.class);
            startActivity(y);
        }
        //MenuItem map_bottom_menu = (MenuItem) findViewById(R.id.bottom_menu);
        return true;
    }
}

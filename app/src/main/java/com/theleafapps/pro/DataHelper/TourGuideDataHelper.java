package com.theleafapps.pro.DataHelper;

import com.theleafapps.pro.R;
import com.theleafapps.pro.model.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aviator on 25/12/17.
 */

public class TourGuideDataHelper {

    /**
     * Method returns the list of events
     *
     * @return List of Element object which contains all events in the city
     */
    public static List<Element> getEvents() {

        List<Element> events = new ArrayList<>();
        events.add(new Element("Christmas Carnival",
                                "Christmas Carnival by Vanya's Dance Planet and Nik's creations with Cakes n craft in association with Billabong High international School !! \n",
                                R.drawable.carnival));
        events.add(new Element("Indore Marathon 2018",
                "Indore Marathon 2017 aims towards creating a ’Clean, Green & Healthy Indore. you can participate in any of the three types - 21 KM (half-marathon), 10 KM, and 5 KM, under a particular category: International Women, International Men, Open National Women, Open National Men, Open District Women, Open District Men Category’",
                R.drawable.marathon));
        events.add(new Element("Neha Kakkar Live Musical Concert",
                "The Selfie queen and the most peppy voice of India known for singing rocking dancing numbers - Neha Kakkar Indore !! Watch this young music icon performing live on 6th January 2018 !!",
                R.drawable.kakkar));
        events.add(new Element("The Haat - Fashion Exhibition",
                "The Haat is the India's most glamorous fashion exhibition providing a platform, for talented designers from around the world to showcase their products !! The Haat would showcase the hottest trends in textiles, accessories, materials along with sourcing and fashion all the latest innovations in fibre, yarn, fabric, accessories !!",
                R.drawable.fashion));
        events.add(new Element("Adventure Carnival",
                "Decathlon organising Adventure Carnival !! \n" +
                        "\n" +
                        "Participate in more than 20 adventure activities like Paintball, Wall Climbing, ATV ride, Horse riding, Slack line, Sumo fight, etc. and many more adventurous activities in row !!",
                R.drawable.adventure));
        return events;
    }

    /**
     * Method returns the list of restaurants
     *
     * @return List of Element object which contains all restaurants in the city
     */
    public static List<Element> getRestaurants() {

        List<Element> restaurants = new ArrayList<>();
        restaurants.add(new Element("Bougainvillea Café",
                "Inside the luxury retail store Bougainvillea, after finishing your shopping or taking a break from the dutiful task of spending money, you step into the Bougainvillea Café !! \n" +
                        "\n" +
                        "This café is all about having some good time, in a stylish way !! You can find refuge under the lovely paintings from various artists, both renowned and upcoming, while enjoying gourmet food, coffees and teas !! \n",
                R.drawable.bouganvilla));
        restaurants.add(new Element("Cakewalk",
                "Cakewalk, the patisserie/bakery at Radisson Blu hotel serves great breads, pastries, cookies, chocolates, and other desserts/sweet breads !! Make birthdays, anniversaries, and other celebrations more special by ordering cakes,  and if you prefer, you can even design your own cake !!",
                R.drawable.cakewalk));
        restaurants.add(new Element("Indiya Oye",
                "The new specialty fine dining Indian restaurant at Radisson Blu hotel has a great decorative ambiance and serves very good kebabs, cocktails, and food ! There are singers performing every night to provide background music ! Hotel Radisson Blu's service is top-class ! Don't forget to have the paan at the check-out ! ",
                R.drawable.indiaoye));
        restaurants.add(new Element("Panchavati Gaurav",
                "Panchavati Gaurav restaurant serves pure vegetarian food in a pre-set meal (Thaali) !! The cuisines served here are Indian - Gujarati & Rajasthani - including salads, papad, & pickles, chutneys, appetisers (starters), and desserts !! Their menu changes very frequently, often daily !! \n",
                R.drawable.panchavatigaurav));
        restaurants.add(new Element("O2 Café De La Ville",
                "The people behind the highly successful O2 Disc & Lounge bring their latest offering to Indore - the O2 Café De La Ville, which is a library and chic modern café !! It is also Indore's one of the only few cafés that are open till really late in the night (or early morning, if you would) - open till 2:30 AM everyday !!",
                R.drawable.o2cafe));
        return restaurants;
    }

    /**
     * Method returns the list of historical sites
     *
     * @return List of Element object which contains all historical sites in the city
     */
    public static List<Element> getHistoricalSites() {

        List<Element> historicalSites = new ArrayList<>();
        historicalSites.add(new Element("Rajwada",
                "City’s iconic and most prominent structure, the one that represents Indore even in the modern world, is not just another historic monument ! It has a great saga behind it and is like a legacy of the Holkar dynasty that has been passed on through the ages ! To showcase the glorious history of Indore, Malwa, and Holkar dynasty",
                R.drawable.rajwada));
        historicalSites.add(new Element("Lalbagh Palace",
                "One of the royal palaces of t\u00ADhe Holkar dynasty, the LalBagh Palace is one of the most prominent examples of Holkar era architecture in Indore ! It is one of the best palaces and historical attractions in Indore ! It was commissioned by Tukoji Rao Holkar.",
                R.drawable.lalbagh));
        historicalSites.add(new Element("Gandhi Hall",
                "The Gandhi Hall was originally known as King Edward Hall, but H. H. Yeshwant Rao Holkar II (reign: 1926 - 1948) renamed it in 1948, after the death of Mahatma Gandhi ! This town hall was designed & constructed by architect Mr. Charles Frederick Stevens from Mumbai at a cost of Rs. 2,50,000 and was inaugurated by Prince of Wales, George V in 1905",
                R.drawable.gandhihall));
        historicalSites.add(new Element("Mandu (Mandavgarh)",
                "Mandu or Mandavgarh (Māndu or Māndavgarh) - ruined city in Dhar (Dhār) district of Malwa (Mālwā) region in Western Madhya Pradesh, Central India ! Mandu has more history than we can think and maybe has much more interesting facts about its historical significance and strategic importance than we can probably imagine ! It is also said to be known as Mandap Durga in earlier times ! It has also been called as the City of Joy or Shadiabad ",
                R.drawable.mandu));
        historicalSites.add(new Element("The Daly College",
                "The Daly College, Indore, or just DC as most know it, is one of the oldest public schools in India !! During its extremely long life span, the Daly College has developed tremendous expertise and insight into the management of transitions through the educational process !! ",
                R.drawable.dalycollege));
        return historicalSites;
    }

    /**
     * Method returns the list of religious sites
     *
     * @return List of Element object which contains all religious sites in the city
     */
    public static List<Element> getReligiousSites() {

        List<Element> religiousSites = new ArrayList<>();
        religiousSites.add(new Element("Khajrana Ganesh Mandir",
                "Built in the year 1875, during the reign of Rani Ahilya Bai Holkar, Khajrana Temple is a very famous and revered Ganesh temple in the country !!\n" +
                        "\n" +
                        "An important pilgrimage center, Khajrana Ganesh temple in Indore is a devotees' delight !! It is believed that all the wishes would be fulfilled, after praying here !! Large numbers of devotees gather here on Wednesdays and Sundays to offer their reverence and prayers !!",
                R.drawable.khajranaganeshji));
        religiousSites.add(new Element("Annapurna Mandir",
                "Dedicated to the goddess Annapurna (Annapoornaa), this temple is one among the famous pilgrimage centers in Indore !! Not only devotees, but also tourists come to see this majestic shrine !!",
                R.drawable.annapurna));
        religiousSites.add(new Element("White Church",
                "St. Anns Church (White Church) was built in 1858 by Protestant Christians ! This church in Indore was funded by Sir Robert North Hamilton of the British empire at that time ! Inspired by European architecture, the Church was designed by Engineer Ross McMahon !",
                R.drawable.whitechurch));
        religiousSites.add(new Element("Devguraadiaa Shiv Mandir",
                "Devguraadiaa Shiv Mandir (temple) is situated in the Devguraadiaa village, which is around 8 km from Indore's city-centre, on the Nemawar Road ! \n" +
                        "\n" +
                        "This immensely popular and revered temple is a monolithic rock temple, which was built in the 7th century AD ! Indore's legendary ruler - Ahilya Bai Holkar - ordered the reconstruction of this temple in 18th century AD ! Popularly known as Garuda Tirth, this temple has a water outlet in the shape of a Gomukh !",
                R.drawable.devguradiya));
        religiousSites.add(new Element("Badaa Ganapati Temple",
                "Not only is this Ganesh temple highly revered, but also this is immensely famous for housing possibly the largest Ganesh idol in the world, measuring 25 feet (almost 8 metres) from crown to foot !! \n" +
                        "\n" +
                        "What is also very interesting about this temple is that it was built in the year 1875 A. D. with soil collected from the seven sacred cities of India",
                R.drawable.badaganpati));
        return religiousSites;
    }
}

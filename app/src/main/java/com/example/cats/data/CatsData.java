/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.data;

import com.example.cats.models.Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class CatsData {

    private static ArrayList<Cat> arrayList = new ArrayList<>();

    public static ArrayList<Cat> getArrayList() {
        arrayList.clear();
        arrayList.add(new Cat(
                "Abyssinian",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Gustav_chocolate.jpg/220px-Gustav_chocolate.jpg",
                "Egypt",
                "14 to 15",
                "The Abyssinian is easy to care for, and a joy to have in your home. They’re affectionate cats and love both people and other animals.",
                3,
                4,
                5,
                new ArrayList<>(Arrays.asList("Active", "Energetic", "Independent", "Intelligent", "Gentle"))
        ));
        arrayList.add(new Cat(
                "Aegean",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Aegean_cat.jpg/220px-Aegean_cat.jpg",
                "Greece",
                "9 to 12",
                "Native to the Greek islands known as the Cyclades in the Aegean Sea, these are natural cats, meaning they developed without humans getting involved in their breeding. As a breed, Aegean Cats are rare, although they are numerous on their home islands. They are generally friendly toward people and can be excellent cats for families with children.",
                4,
                4,
                4,
                new ArrayList<>(Arrays.asList("Affectionate", "Social", "Intelligent", "Playful", "Active"))
        ));
        arrayList.add(new Cat(
                "American Bobtail",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/American_bobtail_2.jpg/800px-American_bobtail_2.jpg",
                "United States",
                "11 to 15",
                "American Bobtails are loving and incredibly intelligent cats possessing a distinctive wild appearance. They are extremely interactive cats that bond with their human family with great devotion.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Intelligent", "Interactive", "Lively", "Playful", "Sensitive"))
        ));
        arrayList.add(new Cat(
                "American Curl",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/ACL_Pointocurl_Fiorentina.jpg/1024px-ACL_Pointocurl_Fiorentina.jpg",
                "United States",
                "12 to 16",
                "Distinguished by truly unique ears that curl back in a graceful arc, offering an alert, perky, happily surprised expression, they cause people to break out into a big smile when viewing their first Curl. Curls are very people-oriented, faithful, affectionate soulmates, adjusting remarkably fast to other pets, children, and new situations.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Affectionate", "Curious", "Intelligent", "Interactive", "Lively", "Playful", "Social"))
        ));
        arrayList.add(new Cat(
                "American Shorthair",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/14_years_old_american_shorthair.jpg/800px-14_years_old_american_shorthair.jpg",
                "United States",
                "15 to 17",
                "The American Shorthair is known for its longevity, robust health, good looks, sweet personality, and amiability with children, dogs, and other pets.",
                5,
                3,
                3,
                new ArrayList<>(Arrays.asList("Active", "Curious", "Easy Going", "Playful", "Calm"))
        ));
        arrayList.add(new Cat(
                "American Wirehair",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/American_Wirehair_-_CFF_cat_show_Heinola_2008-05-04_IMG_8721.JPG/800px-American_Wirehair_-_CFF_cat_show_Heinola_2008-05-04_IMG_8721.JPG",
                "United States",
                "14 to 18",
                "The American Wirehair tends to be a calm and tolerant cat who takes life as it comes. His favorite hobby is bird-watching from a sunny windowsill, and his hunting ability will stand you in good stead if insects enter the house.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Affectionate", "Curious", "Gentle", "Intelligent", "Interactive", "Lively", "Loyal", "Playful", "Sensible", "Social"))
        ));
        arrayList.add(new Cat(
                "Arabian Mau",
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Bex_Arabian_Mau.jpg",
                "United Arab Emirates",
                "12 - 14",
                "Arabian Mau cats are social and energetic. Due to their energy levels, these cats do best in homes where their owners will be able to provide them with plenty of playtime, attention and interaction from their owners. These kitties are friendly, intelligent, and adaptable, and will even get along well with other pets and children.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Affectionate", "Agile", "Curious", "Independent", "Playful", "Loyal"))
        ));
        arrayList.add(new Cat(
                "Australian Mist",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Australian_Mist.jpg/800px-Australian_Mist.jpg",
                "Australia",
                "12 to 16",
                "The Australian Mist thrives on human companionship. Tolerant of even the youngest of children, these friendly felines enjoy playing games and being part of the hustle and bustle of a busy household. They make entertaining companions for people of all ages, and are happy to remain indoors between dusk and dawn or to be wholly indoor pets.",
                4,
                5,
                4,
                new ArrayList<>(Arrays.asList("Lively", "Social", "Fun-loving", "Relaxed", "Affectionate"))
        ));
        arrayList.add(new Cat(
                "Balinese",
                "https://upload.wikimedia.org/wikipedia/commons/2/24/Old-Style_Lilac_Point_Balinese.png",
                "United States",
                "10 to 15",
                "Balinese are curious, outgoing, intelligent cats with excellent communication skills. They are known for their chatty personalities and are always eager to tell you their views on life, love, and what you’ve served them for dinner.",
                4,
                5,
                5,
                new ArrayList<>(Arrays.asList("Affectionate", "Intelligent", "Playful"))
        ));
        arrayList.add(new Cat(
                "Bambino",
                "https://www.catbreedslist.com/uploads/allimg/cat-pictures/Bambino-cat-2.jpg",
                "United States",
                "12 to 14",
                "The Bambino is a breed of cat that was created as a cross between the Sphynx and the Munchkin breeds. The Bambino cat has short legs, large upright ears, and is usually hairless. They love to be handled and cuddled up on the laps of their family members.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Affectionate", "Lively", "Friendly", "Intelligent"))
        ));
        arrayList.add(new Cat(
                "Bengal",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Paintedcats_Red_Star_standing.jpg/800px-Paintedcats_Red_Star_standing.jpg",
                "United States",
                "12 to 15",
                "Bengals are a lot of fun to live with, but they're definitely not the cat for everyone, or for first-time cat owners. Extremely intelligent, curious and active, they demand a lot of interaction and woe betide the owner who doesn't provide it.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Alert", "Agile", "Energetic", "Demanding", "Intelligent"))
        ));
        arrayList.add(new Cat(
                "Birman",
                "https://upload.wikimedia.org/wikipedia/commons/0/06/Birmanstrofe.jpg",
                "France",
                "14 to 15",
                "The Birman is a docile, quiet cat who loves people and will follow them from room to room. Expect the Birman to want to be involved in what you’re doing. He communicates in a soft voice, mainly to remind you that perhaps it’s time for dinner or maybe for a nice cuddle on the sofa. He enjoys being held and will relax in your arms like a furry baby.",
                4,
                5,
                3,
                new ArrayList<>(Arrays.asList("Affectionate", "Active", "Gentle", "Social"))
        ));
        arrayList.add(new Cat(
                "Bombay",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Close_up_of_a_black_domestic_cat.jpg/800px-Close_up_of_a_black_domestic_cat.jpg",
                "United States",
                "12 to 16",
                "The the golden eyes and the shiny black coa of the Bopmbay is absolutely striking. Likely to bond most with one family member, the Bombay will follow you from room to room and will almost always have something to say about what you are doing, loving attention and to be carried around, often on his caregiver's shoulder.",
                4,
                5,
                4,
                new ArrayList<>(Arrays.asList("Affectionate", "Dependent", "Gentle", "Intelligent", "Playful"))
        ));
        arrayList.add(new Cat(
                "British Longhair",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/British_Longhair_-_Blue_Bicolor.jpg/800px-British_Longhair_-_Blue_Bicolor.jpg",
                "United Kingdom",
                "12 to 14",
                "The British Longhair is a very laid-back relaxed cat, often perceived to be very independent although they will enjoy the company of an equally relaxed and likeminded cat. They are an affectionate breed, but very much on their own terms and tend to prefer to choose to come and sit with their owners rather than being picked up.",
                4,
                5,
                4,
                new ArrayList<>(Arrays.asList("Affectionate", "Easy Going", "Independent", "Intelligent", "Loyal", "Social"))
        ));
        arrayList.add(new Cat(
                "British Shorthair",
                "https://upload.wikimedia.org/wikipedia/commons/1/15/Britskorthaar-64091287828362D7bA.jpg",
                "United Kingdom",
                "12 to 17",
                "The British Shorthair is a very pleasant cat to have as a companion, ans is easy going and placid. The British is a fiercely loyal, loving cat and will attach herself to every one of her family members. While loving to play, she doesn't need hourly attention. If she is in the mood to play, she will find someone and bring a toy to that person. The British also plays well by herself, and thus is a good companion for single people.",
                4,
                5,
                2,
                new ArrayList<>(Arrays.asList("Affectionate", "Easy Going", "Gentle", "Loyal", "Patient", "calm"))
        ));
        return arrayList;
    }
}

package org.example.common;

import org.example.innerClasses.Product;

import java.util.ArrayList;
import java.util.List;

public class Products {
    public static final List<Product> products=new ArrayList<>();

    static {
        products.add(new Product("Blissful Breeze Candle", 15.99));
        products.add(new Product("Serenity Silk Pillowcase", 29.99));
        products.add(new Product("Radiant Rose Facial Oil", 39.99));
        products.add(new Product("Tranquil Teakettle Set", 49.99));
        products.add(new Product("Enchanted Evening Tea Blend", 12.49));
        products.add(new Product("Harmony Herbal Bath Salts", 17.99));
        products.add(new Product("Moonlit Meadow Reed Diffuser", 22.99));
        products.add(new Product("Zenith Zen Garden Kit", 34.99));
        products.add(new Product("Luminous Lavender Body Scrub", 19.99));
        products.add(new Product("Celestial Ceramic Mug", 9.99));
        products.add(new Product("Whispering Willow Scented Soap Set", 14.99));
        products.add(new Product("Midnight Meditation Eye Mask", 8.99));
        products.add(new Product("Soothing Sea Salt Spray", 16.99));
        products.add(new Product("Tranquility Tonic Herbal Tea", 7.99));
        products.add(new Product("Dreamy Dewdrop Essential Oil", 27.99));
        products.add(new Product("Sunlit Succulent Plant", 11.99));
        products.add(new Product("Cloud Nine Comfort Socks", 6.99));
        products.add(new Product("Starry Night Sleep Mask", 5.99));
        products.add(new Product("Twilight Tranquility Room Spray", 18.99));
        products.add(new Product("Cozy Cabin Throw Blanket", 32.99));

    }
}

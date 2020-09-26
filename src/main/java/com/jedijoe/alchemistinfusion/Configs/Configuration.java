package com.jedijoe.alchemistinfusion.Configs;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Configuration {


    public static final String SCATEGORY_ENABLE = "enable";
    public static final String SCATEGORY_BOOTBALANCE = "balancingboots";
    public static final String SCATEGORY_FOODTIMEBALANCE = "foodtimers";


    public ConfigHelper.ConfigValueListener<Boolean>  ENABLET1STONES;
    public ConfigHelper.ConfigValueListener<Boolean>  ENABLET2STONES;
    public ConfigHelper.ConfigValueListener<Boolean>  ENABLET3STONES;
    public ConfigHelper.ConfigValueListener<Boolean>  ENABLET4STONES;
    public ConfigHelper.ConfigValueListener<Boolean>  ENABLEINFUSEDBOOTS;


    public ConfigHelper.ConfigValueListener<Integer> LEAPBOOTPOWER;
    public ConfigHelper.ConfigValueListener<Integer> LEAPBOOTEXHAUSTION;
    public ConfigHelper.ConfigValueListener<Integer> LUCKSTRENGTH;
    public ConfigHelper.ConfigValueListener<Integer> UNLUCKSTRENGTH;
    public ConfigHelper.ConfigValueListener<Integer> PRODUCTIVEPOTATODURATION;
    public ConfigHelper.ConfigValueListener<Integer> SPICYBEETROOTDURATION;
    public ConfigHelper.ConfigValueListener<Integer> SUGARSTICKDURATION;
    public ConfigHelper.ConfigValueListener<Integer> SUGARSTICKDURATION2;
    public ConfigHelper.ConfigValueListener<Integer> VISIONCARROTDURATION;
    public ConfigHelper.ConfigValueListener<Integer> VISIONCARROTDURATION2;
    public ConfigHelper.ConfigValueListener<Integer> VISIONCARROTDURATION3;
    public ConfigHelper.ConfigValueListener<Integer> IRONSTEAKDURATION;
    public ConfigHelper.ConfigValueListener<Integer> IRONSTEAKDURATION2;
    public ConfigHelper.ConfigValueListener<Integer> HOPPINGRABBITDURATION;
    public ConfigHelper.ConfigValueListener<Integer> IMBUEDRABBITSTEWDURATION;
    public ConfigHelper.ConfigValueListener<Integer> IMBUEDRABBITSTEWDURATION2;
    public ConfigHelper.ConfigValueListener<Integer> IMBUEDRABBITSTEWDURATION3;

    public ConfigHelper.ConfigValueListener<Double> ICEBOOTSTRENGTHDEFAULT;
    public ConfigHelper.ConfigValueListener<Double> ICEBOOTSTRENGTHSPRINT;
    public ConfigHelper.ConfigValueListener<Double> ICEBOOTSTRENGTHSNEAK;
    public ConfigHelper.ConfigValueListener<Double> MOMENTUMCONVERTERPASSTHROUGH;
    
    public ConfigHelper.ConfigValueListener<Boolean> ENABLEFALLBREAKER;
    public ConfigHelper.ConfigValueListener<Boolean> ENABLEMOMENTUMCONVERTER;

    public Configuration(ForgeConfigSpec.Builder builder, ConfigHelper.Subscriber subscriber){
        builder.comment("Enable/Disable").push(SCATEGORY_ENABLE);
        this.ENABLET1STONES = subscriber.subscribe(builder.comment("Enables or Disables the first tier of potion stones, made with dust materials.").define("enableTierOnePotionStones", true));
        this.ENABLET2STONES = subscriber.subscribe(builder.comment("Enables or Disables the second tier of potion stones, made with fragment materials.").define("enableTierTwoPotionStones", true));
        this.ENABLET3STONES = subscriber.subscribe(builder.comment("Enables or Disables the third tier of potion stones, made with gem materials.").define("enableTierThreePotionStones", true));
        this.ENABLET4STONES = subscriber.subscribe(builder.comment("Enables or Disables the fourth tier of potion stones, made by combining third tier stones.").define("enableTierFourPotionStones", true));
        this.ENABLEINFUSEDBOOTS = subscriber.subscribe(builder.comment("Enables or Disables boots infused with special properties").define("enableInfusedBoots", true));
        this.ENABLEFALLBREAKER = subscriber.subscribe(builder.comment("Enables or disables the fall damage reduction of fall breakers").define("enableFallBreakers", true));
        this.ENABLEMOMENTUMCONVERTER = subscriber.subscribe(builder.comment("Enables or disables the effect of the momentum converter (horizontal momentum converted to vertical momentum)").define("enableMomentumConverters", true));
        builder.pop();

        builder.comment("Boot and momentum balance settings").push(SCATEGORY_BOOTBALANCE);
        this.LEAPBOOTPOWER = subscriber.subscribe(builder.comment("Define the jump boost level given with the boots of leaping while crouching").defineInRange("leapBootsPower", 2, 1, 125));
        this.LEAPBOOTEXHAUSTION = subscriber.subscribe(builder.comment("Defines how much exhaustion is given when the leap boot power is used. Is a multiplier, a value of 1 is normal exhaustion, 2 is double, etc.").defineInRange("leapBootsExhaustion", 4, 1, 25));
        this.LUCKSTRENGTH = subscriber.subscribe(builder.comment("Defines the level of luck from the lucky boots").defineInRange("luckStrength", 1, 1, 5));
        this.UNLUCKSTRENGTH = subscriber.subscribe(builder.comment("Defines the level of bad luck from the unlucky boots").defineInRange("unluckStrength", 1, 1, 5));
        this.ICEBOOTSTRENGTHDEFAULT = subscriber.subscribe(builder.comment("Defines push level of boots while not crouching or sprinting").defineInRange("iceBootStrengthStand", 0.01, 0, 5));
        this.ICEBOOTSTRENGTHSPRINT = subscriber.subscribe(builder.comment("Defines push level of boots while sprinting").defineInRange("iceBootStrengthSprint", 0.0225, 0, 5));
        this.ICEBOOTSTRENGTHSNEAK = subscriber.subscribe(builder.comment("Defines push level of boots while sneaking").defineInRange("iceBootStrengthSneak", 0.005, 0, 5));
        this.MOMENTUMCONVERTERPASSTHROUGH = subscriber.subscribe(builder.comment("Defines how much horizontal momentum players keep when running on a momentum converter. 1 is 100%, 0.5 is 50%, etc.").defineInRange("momentumConverterPassthrough", 0.5f, 0, 1));


        builder.pop();

        builder.comment("Food timer balance settings").push(SCATEGORY_FOODTIMEBALANCE);

        this.PRODUCTIVEPOTATODURATION = subscriber.subscribe(builder.comment("Defines how long in seconds a productive potato will give the haste effect").defineInRange("productivePotatoTime", 30, 0, Integer.MAX_VALUE));
        this.SPICYBEETROOTDURATION = subscriber.subscribe(builder.comment("Defines how long in seconds a spicy beetroot will give the fire resistance effect").defineInRange("spicyBeetrootTime", 15, 0, Integer.MAX_VALUE));
        this.SUGARSTICKDURATION = subscriber.subscribe(builder.comment("Defines how long in seconds a sugar stick will give the speed effect").defineInRange("sugarStickTime", 10, 0, Integer.MAX_VALUE));
        this.SUGARSTICKDURATION2 = subscriber.subscribe(builder.comment("Defines how long in seconds a sugar stick will give the nausea effect").defineInRange("sugarStickTime2", 5, 0, Integer.MAX_VALUE));
        this.VISIONCARROTDURATION = subscriber.subscribe(builder.comment("Defines how long in seconds a vision carrot will give the night vision effect").defineInRange("visionCarrotTime", 20, 0, Integer.MAX_VALUE));
        this.VISIONCARROTDURATION2 = subscriber.subscribe(builder.comment("Defines how long in seconds a vision carrot will give the invisibility effect").defineInRange("visionCarrotTime2", 15, 0, Integer.MAX_VALUE));
        this.VISIONCARROTDURATION3 = subscriber.subscribe(builder.comment("Defines how long in seconds a vision carrot will give the glowing effect").defineInRange("visionCarrotTime3", 20, 0, Integer.MAX_VALUE));
        this.IRONSTEAKDURATION = subscriber.subscribe(builder.comment("Defines how long in seconds an iron steak will give the resistance effect").defineInRange("ironSteakTime", 60, 0, Integer.MAX_VALUE));
        this.IRONSTEAKDURATION2 = subscriber.subscribe(builder.comment("Defines how long in seconds an iron steak will give the slowness effect").defineInRange("ironSteakTime2", 75, 0, Integer.MAX_VALUE));
        this.HOPPINGRABBITDURATION = subscriber.subscribe(builder.comment("Defines how long in seconds a hopping rabbit will give the jump boost effect").defineInRange("hoppingRabbitTime", 30, 0, Integer.MAX_VALUE));
        this.IMBUEDRABBITSTEWDURATION = subscriber.subscribe(builder.comment("Defines how long in seconds an imbued rabbit stew will give the jump boost effect").defineInRange("imbuedStewTime", 60, 0, Integer.MAX_VALUE));
        this.IMBUEDRABBITSTEWDURATION2 = subscriber.subscribe(builder.comment("Defines how long in seconds an imbued rabbit stew will give the haste effect").defineInRange("imbuedStewTime2", 60, 0, Integer.MAX_VALUE));
        this.IMBUEDRABBITSTEWDURATION3 = subscriber.subscribe(builder.comment("Defines how long in seconds an imbued rabbit stew will give the strength effect- if rolled").defineInRange("imbuedStewTime3", 60, 0, Integer.MAX_VALUE));

        builder.pop();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path){
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();;
        spec.setConfig(configData);
    }

}

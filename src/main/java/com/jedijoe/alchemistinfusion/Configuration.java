package com.jedijoe.alchemistinfusion;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Configuration {

    public static final String CATEGORY_ENABLE = "enable";
    public static final String CATEGORY_BALANCE = "balance";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static  ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.BooleanValue ENABLET1STONES;
    public static ForgeConfigSpec.BooleanValue ENABLET2STONES;
    public static ForgeConfigSpec.BooleanValue ENABLET3STONES;
    public static ForgeConfigSpec.BooleanValue ENABLET4STONES;
    public static ForgeConfigSpec.BooleanValue ENABLEINFUSEDBOOTS;


    public static ForgeConfigSpec.IntValue LEAPBOOTPOWER;
    public static ForgeConfigSpec.IntValue LEAPBOOTEXHAUSTION;
    public static ForgeConfigSpec.IntValue LUCKSTRENGTH;
    public static ForgeConfigSpec.IntValue UNLUCKSTRENGTH;
    public static ForgeConfigSpec.DoubleValue ICEBOOTSTRENGTHDEFAULT;
    public static ForgeConfigSpec.DoubleValue ICEBOOTSTRENGTHSPRINT;
    public static ForgeConfigSpec.DoubleValue ICEBOOTSTRENGTHSNEAK;
    public static ForgeConfigSpec.IntValue PRODUCTIVEPOTATODURATION;
    public static ForgeConfigSpec.IntValue SPICYBEETROOTDURATION;
    public static ForgeConfigSpec.IntValue SUGARSTICKDURATION;
    public static ForgeConfigSpec.IntValue SUGARSTICKDURATION2;
    public static ForgeConfigSpec.IntValue VISIONCARROTDURATION;
    public static ForgeConfigSpec.IntValue VISIONCARROTDURATION2;
    public static ForgeConfigSpec.IntValue VISIONCARROTDURATION3;

    static{
        COMMON_BUILDER.comment("Enable/Disable").push(CATEGORY_ENABLE);
        ENABLET1STONES = COMMON_BUILDER.comment("Enables or Disables the first tier of potion stones, made with dust materials.").define("enableTierOnePotionStones", true);
        ENABLET2STONES = COMMON_BUILDER.comment("Enables or Disables the second tier of potion stones, made with fragment materials.").define("enableTierTwoPotionStones", true);
        ENABLET3STONES = COMMON_BUILDER.comment("Enables or Disables the third tier of potion stones, made with gem materials.").define("enableTierThreePotionStones", true);
        ENABLET4STONES = COMMON_BUILDER.comment("Enables or Disables the fourth tier of potion stones, made by combining third tier stones.").define("enableTierFourPotionStones", true);
        ENABLEINFUSEDBOOTS = COMMON_BUILDER.comment("Enables or Disables boots infused with special properties").define("enableInfusedBoots", true);


        COMMON_BUILDER.pop();


        COMMON_BUILDER.comment("Balance Settings").push(CATEGORY_BALANCE);
        LEAPBOOTPOWER = COMMON_BUILDER.comment("Define the jump boost level given with the boots of leaping while crouching").defineInRange("leapBootsPower", 2, 1, 125);
        LEAPBOOTEXHAUSTION = COMMON_BUILDER.comment("Defines how much exhaustion is given when the leap boot power is used. Is a multiplier, a value of 1 is normal exhaustion, 2 is double, etc.").defineInRange("leapBootsExhaustion", 4, 1, 25);
        LUCKSTRENGTH = COMMON_BUILDER.comment("Defines the level of luck from the lucky boots").defineInRange("luckStrength", 1, 1, 5);
        UNLUCKSTRENGTH = COMMON_BUILDER.comment("Defines the level of bad luck from the unlucky boots").defineInRange("unluckStrength", 1, 1, 5);
        ICEBOOTSTRENGTHDEFAULT = COMMON_BUILDER.comment("Defines push level of boots while not crouching or sprinting").defineInRange("iceBootStrengthStand", 0.01, 0, 5);
        ICEBOOTSTRENGTHSPRINT = COMMON_BUILDER.comment("Defines push level of boots while sprinting").defineInRange("iceBootStrengthSprint", 0.0225, 0, 5);
        ICEBOOTSTRENGTHSNEAK = COMMON_BUILDER.comment("Defines push level of boots while sneaking").defineInRange("iceBootStrengthSneak", 0.005, 0, 5);

        PRODUCTIVEPOTATODURATION = COMMON_BUILDER.comment("Defines how long in seconds a productive potato will give the haste effect").defineInRange("productivePotatoTime", 30, 0, Integer.MAX_VALUE);
        SPICYBEETROOTDURATION = COMMON_BUILDER.comment("Defines how long in seconds a spicy beetroot will give the fire resistance effect").defineInRange("spicyBeetrootTime", 15, 0, Integer.MAX_VALUE);
        SUGARSTICKDURATION = COMMON_BUILDER.comment("Defines how long in seconds a sugar stick will give the speed effect").defineInRange("sugarStickTime", 10, 0, Integer.MAX_VALUE);
        SUGARSTICKDURATION2 = COMMON_BUILDER.comment("Defines how long in seconds a sugar stick will give the nausea effect").defineInRange("sugarStickTime2", 5, 0, Integer.MAX_VALUE);
        VISIONCARROTDURATION = COMMON_BUILDER.comment("Defines how long in seconds a vision carrot will give the night vision effect").defineInRange("visionCarrotTime", 20, 0, Integer.MAX_VALUE);
        VISIONCARROTDURATION2 = COMMON_BUILDER.comment("Defines how long in seconds a vision carrot will give the invisibility effect").defineInRange("visionCarrotTime2", 15, 0, Integer.MAX_VALUE);
        VISIONCARROTDURATION3 = COMMON_BUILDER.comment("Defines how long in seconds a vision carrot will give the glowing effect").defineInRange("visionCarrotTime3", 20, 0, Integer.MAX_VALUE);

        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
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

package com.keitooo.colorsplash.trim;

import com.keitooo.colorsplash.ColorSplash;
import com.keitooo.colorsplash.item.ColorSplashItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ColorSplashTrimMaterials {

    public static final ResourceKey<TrimMaterial> GLASS =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "glass"));
    public static final ResourceKey<TrimMaterial> BLUE_ICE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "blue_ice"));
    public static final ResourceKey<TrimMaterial> DRIPSTONE_BLOCK =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "dripstone_block"));
    public static final ResourceKey<TrimMaterial> MAGMA_BLOCK =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "magma_block"));
    public static final ResourceKey<TrimMaterial> OBSIDIAN =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "obsidian"));
    public static final ResourceKey<TrimMaterial> CRYING_OBSIDIAN =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "crying_obsidian"));
    public static final ResourceKey<TrimMaterial> NETHER_WART =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "nether_wart"));
    public static final ResourceKey<TrimMaterial> END_CRYSTAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "end_crystal"));
    public static final ResourceKey<TrimMaterial> ENDER_PEARL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "ender_pearl"));
    public static final ResourceKey<TrimMaterial> NETHERITE_SCRAP =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "netherite_scrap"));
    public static final ResourceKey<TrimMaterial> LEATHER =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "leather"));
    public static final ResourceKey<TrimMaterial> RABBIT_HIDE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "rabbit_hide"));
    public static final ResourceKey<TrimMaterial> TURTLE_SCUTE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "turtle_scute"));
    public static final ResourceKey<TrimMaterial> ARMADILLO_SCUTE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "armadillo_scute"));
    public static final ResourceKey<TrimMaterial> SLIME_BALL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "slime_ball"));
    public static final ResourceKey<TrimMaterial> PRISMARINE_SHARD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "prismarine_shard"));
    public static final ResourceKey<TrimMaterial> PRISMARINE_CRYSTALS =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "prismarine_crystals"));
    public static final ResourceKey<TrimMaterial> NAUTILUS_SHELL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "nautilus_shell"));
    public static final ResourceKey<TrimMaterial> HEART_OF_THE_SEA =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "heart_of_the_sea"));
    public static final ResourceKey<TrimMaterial> BLAZE_ROD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "blaze_rod"));
    public static final ResourceKey<TrimMaterial> BREEZE_ROD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "breeze_rod"));
    public static final ResourceKey<TrimMaterial> NETHER_STAR =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "nether_star"));
    public static final ResourceKey<TrimMaterial> SHULKER_SHELL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "shulker_shell"));
    public static final ResourceKey<TrimMaterial> ECHO_SHARD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "echo_shard"));
    public static final ResourceKey<TrimMaterial> GLOWSTONE_DUST =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "glowstone_dust"));
    public static final ResourceKey<TrimMaterial> DRAGON_BREATH =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "dragon_breath"));
    public static final ResourceKey<TrimMaterial> MAGMA_CREAM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "magma_cream"));
    public static final ResourceKey<TrimMaterial> GHAST_TEAR =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "ghast_tear"));
    public static final ResourceKey<TrimMaterial> PHANTOM_MEMBRANE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "phantom_membrane"));

    public static final ResourceKey<TrimMaterial> ROSE_GOLD =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ColorSplash.MOD_ID, "rose_gold"));



    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, BLAZE_ROD, Items.BLAZE_ROD, Style.EMPTY.withColor(TextColor.parseColor("#FFA300").getOrThrow()), 0.11F);
        register(context, BLUE_ICE, Items.BLUE_ICE, Style.EMPTY.withColor(TextColor.parseColor("#6C9FED").getOrThrow()), 0.12F);
        register(context, DRAGON_BREATH, Items.DRAGON_BREATH, Style.EMPTY.withColor(TextColor.parseColor("#DF70EA").getOrThrow()), 0.13F);
        register(context, CRYING_OBSIDIAN, Items.CRYING_OBSIDIAN, Style.EMPTY.withColor(TextColor.parseColor("#5D03B7").getOrThrow()), 0.14F);
        register(context, DRIPSTONE_BLOCK, Items.DRIPSTONE_BLOCK, Style.EMPTY.withColor(TextColor.parseColor("#907764").getOrThrow()), 0.15F);
        register(context, ECHO_SHARD, Items.ECHO_SHARD, Style.EMPTY.withColor(TextColor.parseColor("#17B4B7").getOrThrow()), 0.16F);
        register(context, END_CRYSTAL, Items.END_CRYSTAL, Style.EMPTY.withColor(TextColor.parseColor("#D179AD").getOrThrow()), 0.17F);
        register(context, ENDER_PEARL, Items.ENDER_PEARL, Style.EMPTY.withColor(TextColor.parseColor("#2F9372").getOrThrow()), 0.18F);
        register(context, GHAST_TEAR, Items.GHAST_TEAR, Style.EMPTY.withColor(TextColor.parseColor("#91B7BD").getOrThrow()), 0.19F);
        register(context, GLASS, Items.GLASS, Style.EMPTY.withColor(TextColor.parseColor("#FFFFFF").getOrThrow()), 0.21F);
        register(context, GLOWSTONE_DUST, Items.GLOWSTONE_DUST, Style.EMPTY.withColor(TextColor.parseColor("#F9BA61").getOrThrow()), 0.22F);
        register(context, LEATHER, Items.LEATHER, Style.EMPTY.withColor(TextColor.parseColor("#825339").getOrThrow()), 0.23F, Map.of(ArmorMaterials.LEATHER, "leather_darker"));
        register(context, MAGMA_BLOCK, Items.MAGMA_BLOCK, Style.EMPTY.withColor(TextColor.parseColor("#EC7214").getOrThrow()), 0.24F);
        register(context, MAGMA_CREAM, Items.MAGMA_CREAM, Style.EMPTY.withColor(TextColor.parseColor("#D35D7A").getOrThrow()), 0.25F);
        register(context, NAUTILUS_SHELL, Items.NAUTILUS_SHELL, Style.EMPTY.withColor(TextColor.parseColor("#D3C9C2").getOrThrow()), 0.26F);
        register(context, NETHER_STAR, Items.NETHER_STAR, Style.EMPTY.withColor(TextColor.parseColor("#F2F2DE").getOrThrow()), 0.27F);
        register(context, NETHERITE_SCRAP, Items.NETHERITE_SCRAP, Style.EMPTY.withColor(TextColor.parseColor("#896D68").getOrThrow()), 0.28F);
        register(context, OBSIDIAN, Items.OBSIDIAN, Style.EMPTY.withColor(TextColor.parseColor("#482E68").getOrThrow()), 0.29F);
        register(context, PHANTOM_MEMBRANE, Items.PHANTOM_MEMBRANE, Style.EMPTY.withColor(TextColor.parseColor("#7F8F9F").getOrThrow()), 0.31F);
        register(context, PRISMARINE_SHARD, Items.PRISMARINE_SHARD, Style.EMPTY.withColor(TextColor.parseColor("#7BB59A").getOrThrow()), 0.32F);
        register(context, PRISMARINE_CRYSTALS, Items.PRISMARINE_CRYSTALS, Style.EMPTY.withColor(TextColor.parseColor("#BED6C2").getOrThrow()), 0.33F);
        register(context, RABBIT_HIDE, Items.RABBIT_HIDE, Style.EMPTY.withColor(TextColor.parseColor("#C19A6A").getOrThrow()), 0.34F);
        register(context, HEART_OF_THE_SEA, Items.HEART_OF_THE_SEA, Style.EMPTY.withColor(TextColor.parseColor("#1E97B2").getOrThrow()), 0.35F);
        register(context, SHULKER_SHELL, Items.SHULKER_SHELL, Style.EMPTY.withColor(TextColor.parseColor("#A375A2").getOrThrow()), 0.36F);
        register(context, SLIME_BALL, Items.SLIME_BALL, Style.EMPTY.withColor(TextColor.parseColor("#AEE2B0").getOrThrow()), 0.37F);
        register(context, TURTLE_SCUTE, Items.TURTLE_SCUTE, Style.EMPTY.withColor(TextColor.parseColor("#47BF4A").getOrThrow()), 0.38F, Map.of(ArmorMaterials.TURTLE, "turtle_scute_darker"));
        register(context, NETHER_WART, Items.NETHER_WART, Style.EMPTY.withColor(TextColor.parseColor("#8C3247").getOrThrow()), 0.39F);
        register(context, ARMADILLO_SCUTE, Items.ARMADILLO_SCUTE, Style.EMPTY.withColor(TextColor.parseColor("#CE9692").getOrThrow()), 0.41F);
        register(context, BREEZE_ROD, Items.BREEZE_ROD, Style.EMPTY.withColor(TextColor.parseColor("#B0A1D1").getOrThrow()), 0.42F);

        register(context, ROSE_GOLD, ColorSplashItems.ROSE_GOLD.get(), Style.EMPTY.withColor(TextColor.parseColor("#D39181").getOrThrow()), 0.43F);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        register(context, trimKey, item, style, itemModelIndex, Map.of());
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                Style style, float itemModelIndex, Map<Holder<ArmorMaterial>, String> overrideArmorMaterials) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
            Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style),
            overrideArmorMaterials);
    context.register(trimKey, trimmaterial);
    }
}

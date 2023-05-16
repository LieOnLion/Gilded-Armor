package io.github.lieonlion.lolgilded.init;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;

public class TagInit {
    public static final TagKey<Item> GILDED_ARMOR = TagKey.of(RegistryKeys.ITEM, new Identifier("lolgilded", "gilded_armor"));
}

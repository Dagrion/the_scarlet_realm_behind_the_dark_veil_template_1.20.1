package com.dagrion.the_scarlet_realm_behind_the_dark_veil.util;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.TheScarletRealmBehindTheDarkVeil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BLOODY_TOOL = createTag("needs_bloody_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLOODY_TOOL = createTag("incorrect_for_bloody_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID, name));
        }
    }
}

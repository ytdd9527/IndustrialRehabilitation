package org.irmc.industrialrevival.core.utils;

import java.io.File;
import java.util.function.Function;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.irmc.industrialrevival.api.objects.CustomItemStack;
import org.irmc.industrialrevival.core.IndustrialRevival;

@SuppressWarnings({"unused"})
public class Constants {
    public static final String WIKI_URL = "https://ir.hiworldmc.com/";

    public static final String GUIDE_TITLE_KEY = "guide.title";
    public static final String GUIDE_BACK_KEY = "guide.back";
    public static final String GUIDE_CHEAT_KEY = "guide.cheat_title";
    public static final String GUIDE_CHEAT_MODE_NO_PERMISSION_KEY = "guide.cheat_mode_no_permission";
    public static final String GUIDE_SETTINGS_KEY = "guide.settings";
    public static final String GUIDE_BOOKMARKS_KEY = "guide.bookmarks";
    public static final String GUIDE_SEARCH_KEY = "guide.search";

    public static final String GUIDE_PREVIOUS_KEY = "guide.previous";
    public static final String GUIDE_NEXT_KEY = "guide.next";
    public static final String GUIDE_PREVIOUS_ONE_KEY = "guide.previous_one";
    public static final String GUIDE_NEXT_ONE_KEY = "guide.next_one";

    public static final File STORAGE_FOLDER = new File(
            IndustrialRevival.getInstance().getDataFolder().getParentFile().getParentFile(), "irstorage");

    public static final NamespacedKey ITEM_ID_KEY = new NamespacedKey(IndustrialRevival.getInstance(), "ir_item_id");
    public static final NamespacedKey RADIATION_LEVEL_KEY =
            new NamespacedKey(IndustrialRevival.getInstance(), "ir_radiation_level");
    public static final NamespacedKey GUIDE_ITEM_KEY =
            new NamespacedKey(IndustrialRevival.getInstance(), "ir_guide_item");
    public static final NamespacedKey CLEANED_IR_ITEM_ID = KeyUtil.customKey("cleaned_ir_item_id");
    public static final ItemStack BACKGROUND_ITEM =
            new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " ").setCustomModel(19990);

    public static final Function<Player, ItemStack> BACK_BUTTON = p -> new CustomItemStack(
                    Material.ENCHANTED_BOOK,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_BACK_KEY),
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponentList(p, "guide.back_lore"))
            .setCustomModel(19991);

    public static final Function<Player, ItemStack> SETTING_BUTTON = p -> new CustomItemStack(
                    Material.REPEATER,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_SETTINGS_KEY))
            .setCustomModel(19992);

    public static final Function<Player, ItemStack> BOOKMARK_BUTTON = p -> new CustomItemStack(
                    Material.WRITABLE_BOOK,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_BOOKMARKS_KEY))
            .setCustomModel(19993);

    public static final Function<Player, ItemStack> SEARCH_BUTTON = p -> new CustomItemStack(
                    Material.COMPASS,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_SEARCH_KEY))
            .setCustomModel(19994);

    public static final Function<Player, ItemStack> PREVIOUS_BUTTON = p -> new CustomItemStack(
                    Material.LIME_STAINED_GLASS_PANE,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_PREVIOUS_KEY))
            .setCustomModel(19995);

    public static final Function<Player, ItemStack> NEXT_BUTTON = p -> new CustomItemStack(
                    Material.LIME_STAINED_GLASS_PANE,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_NEXT_KEY))
            .setCustomModel(19996);

    public static final Function<Player, ItemStack> PREVIOUS_ONE_BUTTON = p -> new CustomItemStack(
                    Material.LIME_STAINED_GLASS_PANE,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_PREVIOUS_ONE_KEY))
            .setCustomModel(19995);

    public static final Function<Player, ItemStack> NEXT_ONE_BUTTON = p -> new CustomItemStack(
                    Material.LIME_STAINED_GLASS_PANE,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, GUIDE_NEXT_ONE_KEY))
            .setCustomModel(19996);

    public static final Function<Player, ItemStack> WIKI_PAGE_BUTTON = p -> new CustomItemStack(
                    Material.BOOK,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(p, "guide.wiki_page_button"))
            .setCustomModel(19997);

    public static final ItemStack GUIDE_BOOK_ITEM = new CustomItemStack(
                    Material.ENCHANTED_BOOK,
                    IndustrialRevival.getInstance().getLanguageManager().getMsgComponent(null, "guide.book_item_name"))
            .setCustomModel(19998)
            .setPDCData(GUIDE_ITEM_KEY, PersistentDataType.INTEGER, 1);

    public static final ItemStack CHEAT_GUIDE_BOOK_ITEM = new CustomItemStack(
                    Material.ENCHANTED_BOOK,
                    IndustrialRevival.getInstance()
                            .getLanguageManager()
                            .getMsgComponent(null, "guide.cheat_book_item_name"))
            .setCustomModel(19999)
            .setPDCData(GUIDE_ITEM_KEY, PersistentDataType.INTEGER, 2);

    public static final int[] BOARDER_SLOT = {0, 1, 3, 4, 5, 7, 8, 45, 46, 48, 49, 50, 52, 53};
    public static final int[] RECIPE_SLOT = {12, 13, 14, 21, 22, 23, 30, 31, 32};
}

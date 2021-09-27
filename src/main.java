import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

import static org.spigotmc.SpigotConfig.attackDamage;

public class main extends JavaPlugin{
    //플러그인 실행 시에 실행되는 부분
    @Override
    public void onEnable(){
        System.out.println("[PluginTest01] Plugin Enabled!");
        Bukkit.addRecipe(DragonSword_GetRecipe());
        Bukkit.addRecipe(DragonChestplate_GetRecipe());
        Bukkit.addRecipe(DragonLeggings_GetRecipe());
        Bukkit.addRecipe(DragonHelmet_GetRecipe());
        Bukkit.addRecipe(DragonBoots_GetRecipe());
        Bukkit.addRecipe(DragonBow_GetRecipe());

    }


    //플러그인 종료 시에 실행되는 부분
    @Override
    public void onDisable(){
        System.out.println("[PluginTest01] Plugin Disabled!");
    }

    public ShapedRecipe DragonSword_GetRecipe() {

        //ItemStack - DragonSword

        //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dsAttackDamage", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsAttackSpeed", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ItemStack ds = new ItemStack(Material.DIAMOND_SWORD);
        ds.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        ItemMeta im = ds.getItemMeta();
        im.setDisplayName("§5Dragon Sword");
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

        im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        ds.setItemMeta(im);


        //Shaped Recipe - DragonSword

        NamespacedKey key = new NamespacedKey(this, "diamond_sword");
        ShapedRecipe dssr = new ShapedRecipe(key, ds);
        dssr.shape(" b ", "bdb", "obo");
        dssr.setIngredient('b', Material.BLAZE_POWDER);
        dssr.setIngredient('d', Material.DIAMOND_SWORD);
        dssr.setIngredient('o', Material.OBSIDIAN);

        return dssr;
    }
    
    public ShapedRecipe DragonChestplate_GetRecipe() {
        //ItemStack - DragonChestplate

        //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dcArmor", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsArmorToudfs", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ItemStack ds = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ds.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta im = ds.getItemMeta();
        im.setDisplayName("§5Dragon Chestplate");
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

        im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        ds.setItemMeta(im);


        //Shaped Recipe - DragonChestplate

        NamespacedKey key = new NamespacedKey(this, "diamond_chestplate");
        ShapedRecipe dssr = new ShapedRecipe(key, ds);
        dssr.shape(" m ", " d ", "oao");
        dssr.setIngredient('m', Material.MAGMA_CREAM);
        dssr.setIngredient('d', Material.DIAMOND_CHESTPLATE);
        dssr.setIngredient('o', Material.OBSIDIAN);
        dssr.setIngredient('a', Material.ANVIL);

        return dssr;
    }

    public ShapedRecipe DragonLeggings_GetRecipe() {
        //ItemStack - DragonLeggings

        //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dcArmor", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsArmorToudfs", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ItemStack ds = new ItemStack(Material.DIAMOND_LEGGINGS);
        ds.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta im = ds.getItemMeta();
        im.setDisplayName("§5Dragon Leggings");
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

        im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        ds.setItemMeta(im);


        //Shaped Recipe - DragonLeggings

        NamespacedKey key = new NamespacedKey(this, "diamond_leggings");
        ShapedRecipe dssr = new ShapedRecipe(key, ds);
        dssr.shape(" m ", " d ", "oao");
        dssr.setIngredient('m', Material.MAGMA_CREAM);
        dssr.setIngredient('d', Material.DIAMOND_LEGGINGS);
        dssr.setIngredient('o', Material.OBSIDIAN);
        dssr.setIngredient('a', Material.ANVIL);

        return dssr;
    }

    public ShapedRecipe DragonHelmet_GetRecipe() {
        //ItemStack - DragonHelmet

        //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dcArmor", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsArmorToudfs", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ItemStack ds = new ItemStack(Material.DIAMOND_HELMET);
        ds.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta im = ds.getItemMeta();
        im.setDisplayName("§5Dragon Helmet");
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

        im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        ds.setItemMeta(im);


        //Shaped Recipe - DragonHelmet

        NamespacedKey key = new NamespacedKey(this, "diamond_helmet");
        ShapedRecipe dssr = new ShapedRecipe(key, ds);
        dssr.shape(" m ", " d ", "oao");
        dssr.setIngredient('m', Material.MAGMA_CREAM);
        dssr.setIngredient('d', Material.DIAMOND_HELMET);
        dssr.setIngredient('o', Material.OBSIDIAN);
        dssr.setIngredient('a', Material.ANVIL);

        return dssr;
    }

    public ShapedRecipe DragonBoots_GetRecipe() {
        //ItemStack - DragonBoots

        //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dcArmor", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsArmorToudfs", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ItemStack ds = new ItemStack(Material.DIAMOND_BOOTS);
        ds.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta im = ds.getItemMeta();
        im.setDisplayName("§5Dragon Boots");
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

        im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        ds.setItemMeta(im);


        //Shaped Recipe - DragonBoots

        NamespacedKey key = new NamespacedKey(this, "diamond_boots");
        ShapedRecipe dssr = new ShapedRecipe(key, ds);
        dssr.shape(" m ", " d ", "oao");
        dssr.setIngredient('m', Material.MAGMA_CREAM);
        dssr.setIngredient('d', Material.DIAMOND_BOOTS);
        dssr.setIngredient('o', Material.OBSIDIAN);
        dssr.setIngredient('a', Material.ANVIL);

        return dssr;
    }

    public ShapedRecipe DragonBow_GetRecipe() {
        //ItemStack - DragonBow

        //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dcArmor", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsArmorToudfs", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ItemStack ds = new ItemStack(Material.BOW);
        ds.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 4);
        ds.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);

        ItemMeta im = ds.getItemMeta();
        im.setDisplayName("§5Dragon Bow");
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
        //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

        im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        ds.setItemMeta(im);


        //Shaped Recipe - DragonBow

        NamespacedKey key = new NamespacedKey(this, "bow");
        ShapedRecipe dssr = new ShapedRecipe(key, ds);
        dssr.shape(" m ", " b ", "oao");
        dssr.setIngredient('m', Material.MAGMA_CREAM);
        dssr.setIngredient('b', Material.BOW);
        dssr.setIngredient('o', Material.OBSIDIAN);
        dssr.setIngredient('a', Material.ANVIL);

        return dssr;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("giveitem")){
            if(args.length==0) {
                p.sendMessage("§c[아이템] 매개변수가 누락되었습니다");
            }else if(args[0].equals("item")){
                p.sendMessage("<사용 가능한 아이템 목록>");
                p.sendMessage("");
                p.sendMessage("[§5dragon_sword§f]");
            }
            else if(args[0].equals("dragon_sword")){ // Give Dragon Sword to Player
                //AttributeModifier imad = new AttributeModifier(UUID.randomUUID(),"dsAttackDamage", 8.0, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
                //AttributeModifier imas = new AttributeModifier(UUID.randomUUID(),"dsAttackSpeed", 1.6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
                ItemStack ds = new ItemStack(Material.DIAMOND_SWORD);
                ds.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
                ItemMeta im = ds.getItemMeta();
                im.setDisplayName("§5Dragon Sword");
                //im.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, imad);
                //im.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, imas);

                im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
                ds.setItemMeta(im);
                p.getInventory().addItem(ds);
                p.sendMessage("§5[Dragon Sword] §e아이템을 지급했습니다");
            }
            else{
                p.sendMessage("§c<사용법>");
                p.sendMessage("");
                p.sendMessage("/giveitem [아이템 종류]");
                p.sendMessage("§c사용 가능한 아이템 목록를 확인하려면 §e'/giveitem item'§c을(를) 입력하십시오.");
            }
        }
        return true;
    }
}

package net.SrVynicin.teste1.item;

import net.SrVynicin.teste1.Teste1;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, Teste1.MOD_ID);

    public static final RegistryObject<Item> Sapphire = Items.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_Sapphire = Items.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus){
        Items.register(eventBus);
    }
}
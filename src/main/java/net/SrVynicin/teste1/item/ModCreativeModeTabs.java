package net.SrVynicin.teste1.item;

import net.SrVynicin.teste1.Teste1;
import net.SrVynicin.teste1.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Teste1.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Teste1Tab = CREATIVE_MODE_TABS.register("teste1",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Sapphire.get()))
                    .title(Component.translatable("creativetab.teste1"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Sapphire.get());
                        pOutput.accept(ModItems.Raw_Sapphire.get());

                        pOutput.accept(ModBlocks.Sapphire_Block.get());
                        pOutput.accept(ModBlocks.Raw_Sapphire_Block.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

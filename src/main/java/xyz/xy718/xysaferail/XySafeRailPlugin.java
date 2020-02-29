package xyz.xy718.xysaferail;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Order;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "xysaferail",
        name = "XySafeRail",
        description = "一个简单的刷铁轨BUG修复插件",
        authors = {
                "Xy718"
        }
)
public class XySafeRailPlugin {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }

    @Listener(order = Order.EARLY,beforeModifications = true)
    public void onBlockBreak(ChangeBlockEvent event) {
        //首先判断被破坏的是不是铁轨
        //判断一次掉出来的是不是多个


    }
}

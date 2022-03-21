package io.github.orioncraftmc.tellmeicheatnow

import io.github.orioncraftmc.tellmeicheatnow.landia.LandiaPacketManager
import io.github.orioncraftmc.tellmeicheatnow.landia.constants.LandiaAntiCheatConstants
import io.github.orioncraftmc.tellmeicheatnow.model.TMICNPacketManager
import io.github.orioncraftmc.tellmeicheatnow.model.TMICNSupportedServer

object TellMeICheatNow {
    private val packetManagers: MutableMap<TMICNSupportedServer, TMICNPacketManager<*>> = mutableMapOf()

    private fun registerPacketManager(manager: TMICNPacketManager<*>) {
        packetManagers[manager.server] = manager
    }

    fun registerLandiaPacketManager(constants: LandiaAntiCheatConstants) {
        registerPacketManager(LandiaPacketManager(constants))
    }
}
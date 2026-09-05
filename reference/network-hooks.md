# Mixin hooks on network / connection classes (nitro build)

## IIlIIII  ->  ClientPlayNetworkHandler
  - onEntityAnimation
  - onEntityStatus
  - sendChatMessage
  - onEntityDamage

## IIlllllII  ->  ClientConnection
  - addFlowControlHandler
  - send
  - send
  - channelActive
  - channelInactive

## IlIIlIlIl  ->  ClientConnection
  - method_52906(Lnet/minecraft/class_2596;Lio/netty/channel/ChannelFutureListener;Z)V
  - method_52906(Lnet/minecraft/class_2596;Lio/netty/channel/ChannelFutureListener;Z)V

## IlIIlIllI  ->  ClientPlayNetworkHandler
  - onBlockUpdate
  - onChunkDeltaUpdate

## IlIllIlII  ->  ClientCommonNetworkHandler
  - onResourcePackSend

## IlIllll  ->  NetworkUtils
  - download
  - download


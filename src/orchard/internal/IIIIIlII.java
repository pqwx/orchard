/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.gui.render.state.GuiRenderState
 *  net.minecraft.client.gui.render.state.ItemGuiElementRenderState
 *  net.minecraft.client.gui.render.state.SimpleGuiElementRenderState
 *  net.minecraft.client.gui.render.state.TextGuiElementRenderState
 *  net.minecraft.client.gui.render.state.TexturedQuadGuiElementRenderState
 *  net.minecraft.client.gui.render.state.special.SpecialGuiElementRenderState
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import net.minecraft.client.gui.render.state.SimpleGuiElementRenderState;
import net.minecraft.client.gui.render.state.TextGuiElementRenderState;
import net.minecraft.client.gui.render.state.TexturedQuadGuiElementRenderState;
import net.minecraft.client.gui.render.state.special.SpecialGuiElementRenderState;

@Environment(value=EnvType.CLIENT)
final class IIIIIlII
extends GuiRenderState {
    private boolean I;
    private boolean l = true;
    private boolean II;

    public void addSimpleElementToCurrentLayer(TexturedQuadGuiElementRenderState texturedQuadGuiElementRenderState) {
        this.II = true;
        super.addSimpleElementToCurrentLayer(texturedQuadGuiElementRenderState);
    }

    public void addSimpleElement(SimpleGuiElementRenderState simpleGuiElementRenderState) {
        this.II = true;
        super.addSimpleElement(simpleGuiElementRenderState);
    }

    public void applyBlur() {
        this.II = true;
        super.applyBlur();
    }

    public void addPreparedTextElement(SimpleGuiElementRenderState simpleGuiElementRenderState) {
        this.II = true;
        super.addPreparedTextElement(simpleGuiElementRenderState);
    }

    private IIIIIlII() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void I() {
        if (!this.II) {
            if (!this.I) {
                return;
            }
        }
        this.clear();
    }

    public void createNewRootLayer() {
        super.createNewRootLayer();
        if (this.l) {
            this.I = true;
        }
    }

    public void addItem(ItemGuiElementRenderState itemGuiElementRenderState) {
        this.II = true;
        super.addItem(itemGuiElementRenderState);
    }

    public void addText(TextGuiElementRenderState textGuiElementRenderState) {
        this.II = true;
        super.addText(textGuiElementRenderState);
    }

    public void addSpecialElement(SpecialGuiElementRenderState specialGuiElementRenderState) {
        this.II = true;
        super.addSpecialElement(specialGuiElementRenderState);
    }

    private boolean l() {
        return this.II;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void clear() {
        super.clear();
        this.II = false;
        this.I = false;
    }
}


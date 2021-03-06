package minecharacter.block.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class InventoryAnvResult implements IInventory {

	private ItemStack[] stackResult = new ItemStack[1];

	@Override
	public int getSizeInventory() {
		return 1;
	}

	@Override
	public ItemStack getStackInSlot(int par1) {
		return this.stackResult[0];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2) {
		if (this.stackResult[0] != null) {
			ItemStack itemstack = this.stackResult[0];
			this.stackResult[0] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.stackResult[0] != null) {
			ItemStack itemstack = this.stackResult[0];
			this.stackResult[0] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
		this.stackResult[0] = par2ItemStack;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {

		return true;
	}

	@Override
	public String getInventoryName() {
		return "Result";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public void markDirty() {

	}

	@Override
	public void closeInventory() {

	}

	@Override
	public void openInventory() {

	}
}

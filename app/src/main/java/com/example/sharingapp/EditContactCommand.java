package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {
    private ContactList item_list;
    private Contact new_item;
    private Contact old_item;
    private Context context;

    public EditContactCommand(ContactList item_list,Contact old_item,Contact new_item,Context context){
        this.item_list = item_list;
        this.old_item = old_item;
        this.new_item = new_item;
        this.context = context;
    }

    @Override
    public void execute() {
        item_list.deleteContact(old_item);
        item_list.addContact(new_item);
        setIsExecuted(item_list.saveContacts(context));
    }
}

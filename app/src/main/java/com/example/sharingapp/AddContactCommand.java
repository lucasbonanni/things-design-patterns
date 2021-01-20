package com.example.sharingapp;

import android.content.Context;

public class AddContactCommand extends Command {
    private ContactList item_list;
    private Contact item;
    private Context context;

    public AddContactCommand(ContactList item_list,Contact item,Context context){
        this.item_list = item_list;
        this.item = item;
        this.context = context;
    }

    @Override
    public void execute() {
        item_list.addContact(item);
        setIsExecuted(item_list.saveContacts(context));
    }
}

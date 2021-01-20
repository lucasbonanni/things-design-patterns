package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {
    private ContactList item_list;
    private Contact item;
    private Context context;

    public DeleteContactCommand(ContactList item_list, Contact item, Context context){
        this.item_list = item_list;
        this.item = item;
        this.context = context;
    }

    @Override
    public void execute() {
        this.item_list.deleteContact(item);
        this.setIsExecuted(item_list.saveContacts(this.context));
    }
}

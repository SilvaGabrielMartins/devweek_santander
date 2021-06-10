package com.projeto.bootcamp.exceptions;

import com.projeto.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}

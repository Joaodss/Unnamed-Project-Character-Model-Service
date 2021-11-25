package com.ironhack.charactermodelservice.service;

import com.ironhack.charactermodelservice.dto.CharacterDTO;
import com.ironhack.charactermodelservice.dto.NewCharacterDTO;
import com.ironhack.charactermodelservice.dto.UpdateCharacterDTO;

import java.util.List;
import java.util.Optional;

public interface CharacterService {

    List<CharacterDTO> getAllCharacters();

    CharacterDTO getCharacterById(Long id);

    List<CharacterDTO> getAliveCharactersByUserUsername(String username);

    List<CharacterDTO> getDeadCharactersByUserUsername(String username);

    CharacterDTO createCharacter(NewCharacterDTO newCharacterDTO);

    CharacterDTO updateCharacter(UpdateCharacterDTO updateCharacterDTO);

    void deleteCharacter(Long id);

}
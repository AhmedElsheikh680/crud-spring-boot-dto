package com.spring.service;

import com.spring.model.Player;
import com.spring.model.PlayerDTO;
import com.spring.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService  {

    @Autowired
    private PlayerRepo playerRepo;

    public PlayerDTO findById(Long id)  {
////        PlayerDTO playerDTO = new PlayerDTO();
////        Player player = new Player();
////        playerDTO.setFullName(player.getFirstName()+ " "+player.getLastName());
//        Player player = super.findById(id);
//        PlayerDTO playerDTO  = new PlayerDTO();
//        playerDTO.setFullName(player.getLastName()+ " "+ player.getLastName());
//        return playerDTO;
        Player player =playerRepo.findById(id).orElse(null);
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setId(player.getId());
        playerDTO.setFullName(player.getFirstName()+ " "+player.getLastName());
        playerDTO.setEmail(player.getEmail());
        return playerDTO;

    }
//    @Override
//
    public List<PlayerDTO> findAll() {
//        PlayerDTO playerDTO = new PlayerDTO();
//        Player player = new Player();
//        playerDTO.setFullName(player.getFirstName()+ " "+player.getLastName());

        List<Player> players = playerRepo.findAll();
        List<PlayerDTO> playerDTOS = new ArrayList<>();
        for (Player player : players) {
            PlayerDTO playerDTO = new PlayerDTO();
            playerDTO.setId(player.getId());
            playerDTO.setFullName(player.getFirstName() + " " + player.getLastName());
            playerDTO.setEmail(player.getEmail());
            playerDTOS.add(playerDTO);
        }
        return playerDTOS;

//        return ((List<Player>) playerRepo
//                .findAll())
//                .stream()
//                .map(this::convertDataIntoDTO)
//                .collect(Collectors.toList());

//        PlayerDTO playerDTO = new PlayerDTO();
//       playerDTO.setId(players.get(0).getId());
//       playerDTO.setFullName(players.get(0).getFirstName()+ " "+players.get(0)+g);
    }
//    private PlayerDTO convertDataIntoDTO (Player playrData) {
//
//        // create instance of our UserLocationDTO class
//        PlayerDTO dto = new PlayerDTO();
//
//        //set username and userId in dto from the userData
//        dto.setId(playrData.getId());
//        dto.setFullName(playrData.getFirstName()+ playrData.getLastName());
//        dto.setEmail(playrData.getEmail());
//        return dto;
//    }
//    @Override
//
//    public Player save(Player player){
//        return super.save(player);
//    }
//    @Override
//
//    public PlayerDTO update(Player player)  {
//        Player playerOptional = null;
//        try {
//            playerOptional = findById(player.getId());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        playerOptional.setFirstName(player.getFirstName());
//        playerOptional.setLastName(player.getLastName());
//        playerOptional.setEmail(player.getEmail());
//
//        return super.update(playerOptional);
//    }
//    @Override
//
//    public void delete(Long id){
//        super.delete(id);
//    }
//
//    public  Player findByFirstNameLastName(String firstName, String lastName){
//        return playerRepo.findByFirstNameAndLastName(firstName, lastName);
//    }
//

}

package com.spring.controller;

import com.spring.model.Player;
import com.spring.model.PlayerDTO;
import com.spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
//       Player player =  playerService.findById(id);
//        PlayerDTO playerDTO = new PlayerDTO();
//        playerDTO.setFullName(player.getFirstName()+ " "+player.getLastName());
//        return new ResponseEntity<>(playerDTO, HttpStatus.OK);
////        return ResponseEntity.ok(playerService.findById(id));
        return ResponseEntity.ok(playerService.findById(id));
    }
    @GetMapping("")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(playerService.findAll());
    }
//
//    @PostMapping("/player")
//    public ResponseEntity<?> save(@RequestBody Player player){
//        return ResponseEntity.ok(playerService.save(player));
//    }
//    @PutMapping("/player")
//    public ResponseEntity<?> update(@RequestBody Player player) throws Exception {
//        return ResponseEntity.ok(playerService.update(player));
//    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long  id){
//        playerService.delete(id);
//         return ResponseEntity.ok(null);
//    }
//    @GetMapping("/{firstName}/player/{lastName}")
//    public ResponseEntity<Player> getPlayer(@PathVariable String firstName, @PathVariable String lastName){
//        Player player = playerService.findByFirstNameLastName(firstName, lastName);
//       return new ResponseEntity<>(player, HttpStatus.OK);
//    }
}

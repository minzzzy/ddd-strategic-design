package kitchenpos.controller.menu;

import kitchenpos.bo.menu.MenuBo;
import kitchenpos.domain.menu.Menu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class MenuRestController {
    private final MenuBo menuBo;

    public MenuRestController(final MenuBo menuBo) {
        this.menuBo = menuBo;
    }

    @PostMapping("/api/menus")
    public ResponseEntity<Menu> create(@RequestBody final Menu menu) {
        final Menu created = menuBo.create(menu);
        final URI uri = URI.create("/api/menus/" + created.getId());
        return ResponseEntity.created(uri)
                .body(created)
                ;
    }

    @GetMapping("/api/menus")
    public ResponseEntity<List<Menu>> list() {
        return ResponseEntity.ok()
                .body(menuBo.list())
                ;
    }
}

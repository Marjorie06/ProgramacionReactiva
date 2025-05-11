/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.programacionreactiva;

import reactor.core.publisher.Mono;

/**
 *
 *@Marjorie Chimbo
 */
public class ProgramacionReactiva {

    public static void main(String[] args) {
        // Simulamos que este valor viene de una fuente externa de eventos
        Mono<Integer> flujoValor = Mono.just(5);

        flujoValor
                .filter(v -> v > 0)
                .doOnNext(v -> System.out.println("Se ha recibido un valor positivo!"))
                .switchIfEmpty(Mono.fromRunnable(()
                        -> System.out.println("Valor no válido o negativo.")
                ))
                .subscribe();
    }
}
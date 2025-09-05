package io.github.marlon.ecommerce.ecommerceapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "pedidos")
@EntityListeners(AuditingEntityListener.class)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createAt;
    private Integer totalValue;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "order")
    private Set<OrderItem> orderItemSet;

}

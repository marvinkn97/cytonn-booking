package dev.marvin.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_tickets")
@Data
@Builder
public class Ticket {
    @Id
    @GeneratedValue
    private Integer ticketId;

    private BigDecimal ticketPrice;

    private TicketStatus ticketStatus;

    @ManyToOne
    private TicketType ticketType;

    private Integer ticketCount;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
